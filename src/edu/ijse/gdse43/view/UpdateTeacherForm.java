/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.view;

import edu.ijse.gdse43.custom.controller.TeacherController;
import edu.ijse.gdse43.core.dto.TeacherDTO;
import edu.ijse.gdse43.util.Validation;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DEll
 */
public class UpdateTeacherForm extends javax.swing.JPanel {

    /**
     * Creates new form UpdateTeacherForm
     */
    public UpdateTeacherForm() throws ClassNotFoundException, SQLException, Exception {
        initComponents();
        loadTeacherIds();
        txtName.requestFocus();
        teacherIdComboBox.setSelectedItem("");
        txtName.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
        txtNID.setText("");
        txtSubject.setText("");
        txtSubject.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel22 = new org.jdesktop.swingx.JXLabel();
        jXLabel23 = new org.jdesktop.swingx.JXLabel();
        jXLabel24 = new org.jdesktop.swingx.JXLabel();
        jXLabel25 = new org.jdesktop.swingx.JXLabel();
        jXLabel26 = new org.jdesktop.swingx.JXLabel();
        jXLabel28 = new org.jdesktop.swingx.JXLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtNID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtSubject = new javax.swing.JTextField();
        teacherIdComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jXLabel1.setText("                               UPDATE  TEACHER");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 90));

        jXLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel22.setText("Teacher Name");
        jXLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 113, 25));

        jXLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel23.setText("Address");
        jXLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 113, 25));

        jXLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel24.setText("Phone");
        jXLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 113, 25));

        jXLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel25.setText("National ID");
        jXLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 113, 25));

        jXLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel26.setText("Subject");
        jXLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 113, 25));

        jXLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel28.setText("Teacher ID");
        jXLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 113, 25));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 400, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 520, -1));

        txtNID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIDActionPerformed(evt);
            }
        });
        add(txtNID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 200, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 100, 40));

        btnCancel.setBackground(new java.awt.Color(0, 0, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 100, 40));
        add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 200, -1));

        teacherIdComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teacherIdComboBoxItemStateChanged(evt);
            }
        });
        teacherIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherIdComboBoxActionPerformed(evt);
            }
        });
        add(teacherIdComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        txtPhone.requestFocus();          // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed

        txtAddress.requestFocus();          // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        txtNID.requestFocus();          // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtNIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIDActionPerformed
        txtSubject.requestFocus();          // TODO add your handling code here:
    }//GEN-LAST:event_txtNIDActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            TeacherDTO teacheer = new TeacherDTO(
                    txtName.getText(),
                    txtName.getText(),
                    txtPhone.getText(),
                    txtAddress.getText(),
                    txtNID.getText(),
                    txtSubject.getText());
            boolean result = TeacherController.updateTeacher(teacheer);
           
             String TeacherName=txtName.getText();
              
              if (TeacherName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Teacher name");
            txtName.selectAll();
            txtName.requestFocusInWindow();
            return;
              }
               String Phone=txtPhone.getText();
              
              if (Phone.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Phone number");
            txtPhone.selectAll();
            txtPhone.requestFocusInWindow();
            return;
              }
               String Address=txtAddress.getText();
              
              if (Address.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Address");
           txtAddress.selectAll();
            txtAddress.requestFocusInWindow();
            return;
              }
               String NIC=txtNID.getText();
              
              if (TeacherName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a NIC");
            txtNID.selectAll();
            txtNID.requestFocusInWindow();
            return;
              }
              
            } catch (Exception ex) {
                Logger.getLogger(AddTeacherForm.class.getName()).log(Level.SEVERE, null, ex);
            }
             JOptionPane.showMessageDialog(this,"Teacher has been successfully Updated");
       

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
 int response = JOptionPane.showConfirmDialog(this, "Are you sure want to cancel");
        if (response == 0) {
            txtName.setText("");
            txtPhone.setText("");
            txtAddress.setText("");
            txtNID.setText("");
            txtSubject.setText("");
            txtName.requestFocus();
        }else if(response==1){
            
        }else if(response==2){
            
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void teacherIdComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_teacherIdComboBoxItemStateChanged
        try {
            String TeacherID = (String) teacherIdComboBox.getSelectedItem().toString();
            TeacherDTO teacher = null;
            teacher = TeacherController.searchTeacher(TeacherID);
            txtName.setText(teacher.getName());
            txtPhone.setText(teacher.getPhone());
            txtAddress.setText(teacher.getAddress());
            txtNID.setText(teacher.getNic());
            txtSubject.setText(teacher.getSubject());

            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(DeleteTeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_teacherIdComboBoxItemStateChanged

    private void teacherIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherIdComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherIdComboBoxActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        Validation.name(txtName);
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
Validation.phoneNumber(txtPhone);
    }//GEN-LAST:event_txtPhoneKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnUpdate;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel22;
    private org.jdesktop.swingx.JXLabel jXLabel23;
    private org.jdesktop.swingx.JXLabel jXLabel24;
    private org.jdesktop.swingx.JXLabel jXLabel25;
    private org.jdesktop.swingx.JXLabel jXLabel26;
    private org.jdesktop.swingx.JXLabel jXLabel28;
    private javax.swing.JComboBox teacherIdComboBox;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtNID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables

    private void loadTeacherIds() throws Exception {
        ArrayList<TeacherDTO> teacherList = TeacherController.getAllTeachers();
        for (TeacherDTO teacherId : teacherList) {
            teacherIdComboBox.addItem(teacherId.getTeacherID());

        }

    }
}
