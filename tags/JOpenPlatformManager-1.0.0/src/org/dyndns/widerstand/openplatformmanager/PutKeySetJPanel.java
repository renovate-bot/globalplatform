/*
 * PutKeySetJPanel.java
 *
 * Created on 23. Februar 2005, 09:35
 */

package org.dyndns.widerstand.openplatformmanager;

import org.dyndns.widerstand.OpenPlatform.*;
import javax.swing.*;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author  Widerstand
 */
public class PutKeySetJPanel extends javax.swing.JPanel {
    
    private MainJFrame parent;
    private String password = new String();
    private SwingUtil swingUtil;
    private javax.swing.JButton jButtonputKeysDelegatedManagement;
    private javax.swing.JButton jButtonreceiptGenerationKey;
    private javax.swing.JButton jButtontokenVerificationKey;
    private javax.swing.JCheckBox jCheckBoxreceiptGenerationKey;
    private javax.swing.JLabel jLabelreceiptGenerationKey;
    private javax.swing.JLabel jLabeltokenVerificationKey;
    private javax.swing.JPanel jPaneldelegatedManagement;
    private javax.swing.JPasswordField jPasswordFieldreceiptGenerationKey;
    private javax.swing.JTextField jTextFieldtokenVerificationKey;
    
    /** Creates new form PutKeySetJPanel */
    public PutKeySetJPanel(MainJFrame parent) {
        this.parent = parent;
        swingUtil = new SwingUtil();
        initComponents();
    }
    
    private void initConditionalComponents() {
        if (jPaneldelegatedManagement != null)
            jPanel9.remove(jPaneldelegatedManagement);
        
        java.awt.GridBagConstraints gridBagConstraints;
        jPaneldelegatedManagement = new javax.swing.JPanel();
        jLabeltokenVerificationKey = new javax.swing.JLabel();
        jTextFieldtokenVerificationKey = new javax.swing.JTextField();
        jButtontokenVerificationKey = new javax.swing.JButton();
        jLabelreceiptGenerationKey = new javax.swing.JLabel();
        jButtonputKeysDelegatedManagement = new javax.swing.JButton();
        jButtonreceiptGenerationKey = new javax.swing.JButton();
        jCheckBoxreceiptGenerationKey = new javax.swing.JCheckBox();
        jPasswordFieldreceiptGenerationKey = new javax.swing.JPasswordField();
        jPaneldelegatedManagement.setLayout(new java.awt.GridBagLayout());
        
        jPaneldelegatedManagement.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Delegated Management Keys"), new javax.swing.border.EmptyBorder(new java.awt.Insets(5, 5, 5, 5))));
        jLabeltokenVerificationKey.setText("RSA Key");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPaneldelegatedManagement.add(jLabeltokenVerificationKey, gridBagConstraints);
        
        jTextFieldtokenVerificationKey.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPaneldelegatedManagement.add(jTextFieldtokenVerificationKey, gridBagConstraints);
        
        jButtontokenVerificationKey.setText("Load Key File");
        jButtontokenVerificationKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontokenVerificationKeyActionPerformed(evt);
            }
        });
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPaneldelegatedManagement.add(jButtontokenVerificationKey, gridBagConstraints);
        
        jLabelreceiptGenerationKey.setText("Receipt Generation Key");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPaneldelegatedManagement.add(jLabelreceiptGenerationKey, gridBagConstraints);
        
        jButtonputKeysDelegatedManagement.setText("Put Key");
        jButtonputKeysDelegatedManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonputKeysDelegatedManagementActionPerformed(evt);
            }
        });
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPaneldelegatedManagement.add(jButtonputKeysDelegatedManagement, gridBagConstraints);
        
        jButtonreceiptGenerationKey.setText("Load Key");
        jButtonreceiptGenerationKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreceiptGenerationKeyActionPerformed(evt);
            }
        });
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPaneldelegatedManagement.add(jButtonreceiptGenerationKey, gridBagConstraints);
        
        jCheckBoxreceiptGenerationKey.setText("Display as Cleartext");
        jCheckBoxreceiptGenerationKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxreceiptGenerationKeyActionPerformed(evt);
            }
        });
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPaneldelegatedManagement.add(jCheckBoxreceiptGenerationKey, gridBagConstraints);
        
        jPasswordFieldreceiptGenerationKey.setColumns(47);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPaneldelegatedManagement.add(jPasswordFieldreceiptGenerationKey, gridBagConstraints);
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel9.add(jPaneldelegatedManagement, gridBagConstraints);
    }
    
    private void removeConditionalComponents() {
        if (jPaneldelegatedManagement != null)
            jPanel9.remove(jPaneldelegatedManagement);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelENCKey = new javax.swing.JLabel();
        jLabelMACKey = new javax.swing.JLabel();
        jLabelKEKKey = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonENCKey = new javax.swing.JButton();
        jButtonMACKey = new javax.swing.JButton();
        jButtonKEKKey = new javax.swing.JButton();
        jCheckBoxKEKKey = new javax.swing.JCheckBox();
        jCheckBoxMACKey = new javax.swing.JCheckBox();
        jCheckBoxENCKey = new javax.swing.JCheckBox();
        jPasswordFieldENCKey = new javax.swing.JPasswordField();
        jPasswordFieldMACKey = new javax.swing.JPasswordField();
        jPasswordFieldKEKKey = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jLabelKeySetVersion = new javax.swing.JLabel();
        jLabelNewKeySetVersion = new javax.swing.JLabel();
        jTextFieldKeySetVersion = new javax.swing.JTextField();
        jTextFieldNewKeySetVersion = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Put Key Set"), new javax.swing.border.EmptyBorder(new java.awt.Insets(5, 5, 5, 5))));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Secure Channel Keys"), new javax.swing.border.EmptyBorder(new java.awt.Insets(5, 5, 5, 5))));
        jLabelENCKey.setText("ENC Key");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabelENCKey, gridBagConstraints);

        jLabelMACKey.setText("MAC Key");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabelMACKey, gridBagConstraints);

        jLabelKEKKey.setText("KEK Key");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabelKEKKey, gridBagConstraints);

        jButton1.setText("Put Key");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jButton1, gridBagConstraints);

        jButtonENCKey.setText("Load Key");
        jButtonENCKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENCKeyActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jButtonENCKey, gridBagConstraints);

        jButtonMACKey.setText("Load Key");
        jButtonMACKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMACKeyActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jButtonMACKey, gridBagConstraints);

        jButtonKEKKey.setText("Load Key");
        jButtonKEKKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKEKKeyActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jButtonKEKKey, gridBagConstraints);

        jCheckBoxKEKKey.setText("Display as Cleartext");
        jCheckBoxKEKKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxKEKKeyActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jCheckBoxKEKKey, gridBagConstraints);

        jCheckBoxMACKey.setText("Display as Cleartext");
        jCheckBoxMACKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMACKeyActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jCheckBoxMACKey, gridBagConstraints);

        jCheckBoxENCKey.setText("Display as Cleartext");
        jCheckBoxENCKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxENCKeyActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jCheckBoxENCKey, gridBagConstraints);

        jPasswordFieldENCKey.setColumns(47);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jPasswordFieldENCKey, gridBagConstraints);

        jPasswordFieldMACKey.setColumns(47);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jPasswordFieldMACKey, gridBagConstraints);

        jPasswordFieldKEKKey.setColumns(47);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel2.add(jPasswordFieldKEKKey, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel9.add(jPanel2, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Key Set Version Parameters"), new javax.swing.border.EmptyBorder(new java.awt.Insets(5, 5, 5, 5))));
        jLabelKeySetVersion.setText("Key Set Version");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jLabelKeySetVersion, gridBagConstraints);

        jLabelNewKeySetVersion.setText("New Key Set Version");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jLabelNewKeySetVersion, gridBagConstraints);

        jTextFieldKeySetVersion.setColumns(4);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jTextFieldKeySetVersion, gridBagConstraints);

        jTextFieldNewKeySetVersion.setColumns(4);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jTextFieldNewKeySetVersion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel9.add(jPanel6, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel9);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents
    
    private void jButtonMACKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMACKeyActionPerformed
        final JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(this);
        byte macKey[];
        if (ret == JFileChooser.APPROVE_OPTION) {
            try {
                macKey = OPSPUtil.load3DES(fc.getSelectedFile());
                jPasswordFieldMACKey.setText(OPSPUtil.toHexString(macKey));
            } catch (IOException e) {
                swingUtil.errorInJComponent(this, jPasswordFieldMACKey,
                        e.getMessage(), "I/O Error");
            }
        }
    }//GEN-LAST:event_jButtonMACKeyActionPerformed
    
    private void jButtonKEKKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKEKKeyActionPerformed
        final JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(this);
        byte kekKey[];
        if (ret == JFileChooser.APPROVE_OPTION) {
            try {
                kekKey = OPSPUtil.load3DES(fc.getSelectedFile());
                jPasswordFieldKEKKey.setText(OPSPUtil.toHexString(kekKey));
            } catch (IOException e) {
                swingUtil.errorInJComponent(this, jPasswordFieldKEKKey,
                        e.getMessage(), "I/O Error");
            }
        }
    }//GEN-LAST:event_jButtonKEKKeyActionPerformed
                
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        swingUtil.resetJComponentColor();
        byte[] newEncKey;
        try {
            newEncKey = OPSPUtil.bytesFromHexString(new String(jPasswordFieldENCKey.getPassword()));
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jPasswordFieldENCKey,
                    "Colored text field cannot be understood as Hex String", "Wrong Number Format");
            return;
        }
        byte[] newMacKey;
        try {
            newMacKey = OPSPUtil.bytesFromHexString(new String(jPasswordFieldMACKey.getPassword()));
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jPasswordFieldMACKey,
                    "Colored text field cannot be understood as Hex String", "Wrong Number Format");
            return;
        }
        byte[] newKekKey;
        try {
            newKekKey = OPSPUtil.bytesFromHexString(new String(jPasswordFieldKEKKey.getPassword()));
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jPasswordFieldKEKKey,
                    "Colored text field cannot be understood as Hex String", "Wrong Number Format");
            return;
        }
        Short dummy;
        byte keySetVersion;
        try {
            dummy = Short.decode(jTextFieldKeySetVersion.getText());
            if (dummy > 255 || dummy < 0)
                throw new NumberFormatException();
            keySetVersion = dummy.byteValue();
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jTextFieldKeySetVersion,
                    "Colored text field cannot be understood as Number", "Wrong Number Format");
            return;
        }
        byte newKeySetVersion;
        try {
            dummy = Short.decode(jTextFieldNewKeySetVersion.getText());
            if (dummy > 255 || dummy < 0)
                throw new NumberFormatException();
            newKeySetVersion = dummy.byteValue();
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jTextFieldNewKeySetVersion,
                    "Colored text field cannot be understood as Number", "Wrong Number Format");
            return;
        }
        try {
            OPSPWrapper.putSecureChannelKeys(parent.session.cardHandle, parent.session.secInfo,
                    parent.session.cardInfo, keySetVersion, newKeySetVersion, newEncKey, newMacKey, newKekKey, parent.session.kekKey);
        } catch (OPSPException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Open Platform Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        javax.swing.JOptionPane.showMessageDialog(this, "Put Secure Channel Keys.", "Open Platform Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        parent.refreshStatus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxreceiptGenerationKeyActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        if (jCheckBoxreceiptGenerationKey.isSelected())
            jPasswordFieldreceiptGenerationKey.setEchoChar('\0');
        else
            jPasswordFieldreceiptGenerationKey.setEchoChar('*');
    }                                                             

    private void jButtonreceiptGenerationKeyActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        final JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(this);
        byte receiptGenerationKey[];
        if (ret == JFileChooser.APPROVE_OPTION) {
            try {
                receiptGenerationKey = OPSPUtil.load3DES(fc.getSelectedFile());
                jPasswordFieldreceiptGenerationKey.setText(OPSPUtil.toHexString(receiptGenerationKey));
            } catch (IOException e) {
                swingUtil.errorInJComponent(this, jPasswordFieldreceiptGenerationKey,
                        e.getMessage(), "I/O Error");
            }
        }
    }                                                           

    private void jButtontokenVerificationKeyActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        final JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(this);
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            jTextFieldtokenVerificationKey.setText(file.getAbsolutePath());
            password = PasswordJDialog.showDialog(parent);
        } else {
            password = new String();
        }
    }                                                           

    private void jButtonputKeysDelegatedManagementActionPerformed(java.awt.event.ActionEvent evt) {
        swingUtil.resetJComponentColor();
        byte[] receiptGenerationKey = null;
        try {
            receiptGenerationKey = OPSPUtil.bytesFromHexString(new String(jPasswordFieldreceiptGenerationKey.getPassword()));
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jPasswordFieldreceiptGenerationKey,
                    "Colored text field cannot be understood as Hex String", "Wrong Number Format");
            return;
        }
        Short dummy;
        byte keySetVersion;
        try {
            dummy = Short.decode(jTextFieldKeySetVersion.getText());
            if (dummy > 255 || dummy < 0)
                throw new NumberFormatException();
            keySetVersion = dummy.byteValue();
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jTextFieldKeySetVersion,
                    "Colored text field cannot be understood as Number", "Wrong Number Format");
            return;
        }
        byte newKeySetVersion;
        try {
            dummy = Short.decode(jTextFieldNewKeySetVersion.getText());
            if (dummy > 255 || dummy < 0)
                throw new NumberFormatException();
            newKeySetVersion = dummy.byteValue();
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jTextFieldNewKeySetVersion,
                    "Colored text field cannot be understood as Number", "Wrong Number Format");
            return;
        }
        try {
            OPSPWrapper.putDelegatedManagementKeys(parent.session.cardHandle, parent.session.secInfo,
                    parent.session.cardInfo, keySetVersion, newKeySetVersion,
                    jTextFieldtokenVerificationKey.getText(), password,
                    receiptGenerationKey, parent.session.kekKey);
        } catch (OPSPException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Open Platform Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        javax.swing.JOptionPane.showMessageDialog(this, "Put Delegated Management Keys.", "Open Platform Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
   
    private void jCheckBoxKEKKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxKEKKeyActionPerformed
        if (jCheckBoxKEKKey.isSelected())
            jPasswordFieldKEKKey.setEchoChar('\0');
        else
            jPasswordFieldKEKKey.setEchoChar('*');
    }//GEN-LAST:event_jCheckBoxKEKKeyActionPerformed
    
    private void jCheckBoxMACKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMACKeyActionPerformed
        if (jCheckBoxMACKey.isSelected())
            jPasswordFieldMACKey.setEchoChar('\0');
        else
            jPasswordFieldMACKey.setEchoChar('*');
    }//GEN-LAST:event_jCheckBoxMACKeyActionPerformed
    
    private void jCheckBoxENCKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxENCKeyActionPerformed
        if (jCheckBoxENCKey.isSelected())
            jPasswordFieldENCKey.setEchoChar('\0');
        else
            jPasswordFieldENCKey.setEchoChar('*');
    }//GEN-LAST:event_jCheckBoxENCKeyActionPerformed
    
    private void jButtonENCKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENCKeyActionPerformed
        final JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(this);
        byte encKey[];
        if (ret == JFileChooser.APPROVE_OPTION) {
            try {
                encKey = OPSPUtil.load3DES(fc.getSelectedFile());
                jPasswordFieldENCKey.setText(OPSPUtil.toHexString(encKey));
            } catch (IOException e) {
                swingUtil.errorInJComponent(this, jPasswordFieldENCKey,
                        e.getMessage(), "I/O Error");
            }
        }
    }//GEN-LAST:event_jButtonENCKeyActionPerformed
    
    public void refresh() {
        if (Arrays.equals(parent.session.selectedApplication, OPSPApplet.OPSP_CARD_MANAGER_AID)) {
            initConditionalComponents();
            jPanel9.revalidate();
        }
        else {
            removeConditionalComponents();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonENCKey;
    private javax.swing.JButton jButtonKEKKey;
    private javax.swing.JButton jButtonMACKey;
    private javax.swing.JCheckBox jCheckBoxENCKey;
    private javax.swing.JCheckBox jCheckBoxKEKKey;
    private javax.swing.JCheckBox jCheckBoxMACKey;
    private javax.swing.JLabel jLabelENCKey;
    private javax.swing.JLabel jLabelKEKKey;
    private javax.swing.JLabel jLabelKeySetVersion;
    private javax.swing.JLabel jLabelMACKey;
    private javax.swing.JLabel jLabelNewKeySetVersion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordFieldENCKey;
    private javax.swing.JPasswordField jPasswordFieldKEKKey;
    private javax.swing.JPasswordField jPasswordFieldMACKey;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldKeySetVersion;
    private javax.swing.JTextField jTextFieldNewKeySetVersion;
    // End of variables declaration//GEN-END:variables
    
}
