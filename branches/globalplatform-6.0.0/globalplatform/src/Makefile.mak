
!include makefile.inc

# replace with your path to the OpenSSL header files
# or specify on command line
OPENSSL_INC=C:\Programme\OpenSSL\include

# replace with your path to the OpenSSL library files
# or specify on command line
OPENSSL_LIB=C:\Programme\OpenSSL\lib

# replace with your path to the zlib header files
# or specify on command line
ZLIB_INC=C:\Programme\GnuWin32\include

# replace with your path to the zlib library files
# or specify on command line
ZLIB_LIB=C:\Programme\GnuWin32\lib

!IF !EXIST($(OPENSSL_INC))
!ERROR Your path to the header files for OpenSSL is wrong. \
Replace it in the Makefile or call nmake with OPENSSL_INC=<PATH_TO_OPENSSL_HEADERS>
!ENDIF

!IF !EXIST($(OPENSSL_LIB))
!ERROR Your path to the library files for OpenSSL is wrong. \
Replace it the Makefile or call nmake with OPENSSL_LIB=<PATH_TO_OPENSSL_LIBS>
!ENDIF

!IF !EXIST($(ZLIB_INC))
!ERROR Your path to the header files for zlib is wrong. \
Replace it in the Makefile or call nmake with ZLIB_INC=<PATH_TO_ZLIB_HEADERS>
!ENDIF

!IF !EXIST($(ZLIB_LIB))
!ERROR Your path to the library files for zlib is wrong. \
Replace it the Makefile or call nmake with ZLIB_LIB=<PATH_TO_ZLIB_LIBS>
!ENDIF

# Directory name may not contain spaces
!IFDEF DEBUG
OUTDIR=Debug
!ELSE
OUTDIR=Release
!ENDIF

OBJS=$(OUTDIR)/stdafx.obj $(OUTDIR)/DLLMain.obj $(OUTDIR)/connection.obj $(OUTDIR)/debug.obj \
$(OUTDIR)/util.obj $(OUTDIR)/stringify.obj $(OUTDIR)/loadfile.obj $(OUTDIR)/globalplatform.obj \
$(OUTDIR)/dyn_win32.obj $(OUTDIR)/crypto.obj

MINIZIP=$(OUTDIR)/zip.obj $(OUTDIR)/unzip.obj $(OUTDIR)/ioapi.obj $(OUTDIR)/iowin32.obj

LIB_NAME=globalplatform # the name of the library

CPP=cl

!IFDEF DEBUG
CPPFLAGS=/Od /I $(OPENSSL_INC) /I $(ZLIB_INC) /I . /D "WIN32" /D "_DEBUG" /D "DEBUG" /D "_CONSOLE" /D "OPGP_EXPORTS" /D "_UNICODE" \
/D "_WINDLL" /D "UNICODE" /RTC1 /MD /Fo$(OUTDIR)/ /W3 /nologo /ZI /TC /D _CRT_SECURE_NO_WARNINGS
!ELSE
CPPFLAGS=/O2 /I "$(OPENSSL_INC)" /I $(ZLIB_INC) /I . /D "WIN32" /D "NDEBUG" /D "_CONSOLE" /D "OPGP_EXPORTS" /D "_UNICODE" \
/D "_WINDLL" /D "UNICODE" /FD /MD /Fo$(OUTDIR)/ /W3 /nologo /Zi /TC /D _CRT_SECURE_NO_WARNINGS
!ENDIF

LINK=link
LIB=lib

# Define dummy SDK_LIB1 for additional libraries if not given
!IFNDEF SDK_LIB1
SDK_LIB1=C:\DUMMY
!ENDIF

# Define dummy SDK_LIB2 for additional libraries if not given
!IFNDEF SDK_LIB2
SDK_LIB2=C:\DUMMY
!ENDIF

!IFNDEF TARGET_ARCH
TARGET_ARCH=X86
!ENDIF

!IFDEF DEBUG
LFLAGS=/OUT:$(OUTDIR)/$(LIB_NAME).dll /NOLOGO /LIBPATH:$(OPENSSL_LIB) /LIBPATH:$(ZLIB_LIB) /LIBPATH:"$(SDK_LIB1)" /LIBPATH:"$(SDK_LIB2)" /DLL /DEBUG /PDB:$(OUTDIR)/$(LIB_NAME).pdb \
/SUBSYSTEM:CONSOLE /MACHINE:$(TARGET_ARCH) zlib.lib ssleay32.lib libeay32.lib winscard.lib kernel32.lib user32.lib gdi32.lib winspool.lib \
comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib
!ELSE
LFLAGS=/OUT:$(OUTDIR)/$(LIB_NAME).dll /INCREMENTAL:NO /NOLOGO /LIBPATH:"$(SDK_LIB1)" /LIBPATH:"$(SDK_LIB2)" \
/LIBPATH:$(OPENSSL_LIB) /LIBPATH:$(ZLIB_LIB) /DLL /SUBSYSTEM:CONSOLE \
/OPT:REF /OPT:ICF /MACHINE:$(TARGET_ARCH) zlib.lib ssleay32.lib libeay32.lib winscard.lib kernel32.lib user32.lib gdi32.lib \
winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib
!ENDIF

!IFDEF STATIC
all: create_dirs $(OUTDIR)/$(LIB_NAME).lib
!ELSE
all: create_dirs $(OUTDIR)/$(LIB_NAME).dll
!ENDIF

create_dirs:
	-@mkdir $(OUTDIR)


# compilation and linking
$(OUTDIR)/$(LIB_NAME).dll: $(OBJS) $(MINIZIP) version.res
	$(LINK) $(LFLAGS) $(OBJS) $(MINIZIP) version.res
	$(_VC_MANIFEST_EMBED_DLL)

$(OUTDIR)/$(LIB_NAME).lib: $(OBJS) $(MINIZIP) version.res
	$(LIB) $(LIBFLAGS) $(OBJS) $(MINIZIP) version.res
	$(_VC_MANIFEST_EMBED_DLL)

$(OBJS): $(@B).c
	$(CPP) $(CPPFLAGS) /c /Fd$(OUTDIR)/%|pfF %|pfF.c

$(MINIZIP): unzip/$(@B).c
	$(CPP) $(CPPFLAGS) /c /Fd$(OUTDIR)/$(@B) %|pfF.c

version.res : version.rc
!IFDEF DEBUG
	$(RC) /dDEBUG /i "$(MSSDK)\Include\mfc" version.rc
!ELSE
	$(RC) /i "$(MSSDK)\Include\mfc" version.rc
!ENDIF

# run doxygen
doc: do-doc

VERSION=6.0.0
PREBUILDDIR="GlobalPlatform-$(VERSION)"

prebuild: all
	-@del /S /F /Q $(PREBUILDDIR)
	-@mkdir $(PREBUILDDIR)
	-@mkdir $(PREBUILDDIR)/globalplatform
	cp LICENSE zlib1.dll ssleay32.dll libeay32.dll Debug/globalplatform.dll Debug/globalplatform.lib ChangeLog README COPYING COPYING.LESSER AUTHORS  $(PREBUILDDIR)
	cp globalplatform/globalplatform.h globalplatform/unicode.h $(PREBUILDDIR)/globalplatform
	zip -r $(PREBUILDDIR).zip $(PREBUILDDIR)/*

clean:
	-@rd /S /Q Debug
	-@rd /S /Q Release
	-@rd /S /Q Doc
	-@del version.res
	$(_VC_MANIFEST_CLEAN)

do-doc:
	-@mkdir Doc
	doxygen Doxyfile.cfg

!include makefile.targ.inc
