/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.view;

import edu.ijse.gdse43.core.dto.StudentDTO;
import edu.ijse.gdse43.custom.controller.StudentController;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEll
 */
public class ViewStudentForm extends javax.swing.JPanel {

    /**
     * Creates new form ViewStudentForm
     */
    public ViewStudentForm() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(710, 570));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel1.setBackground(new java.awt.Color(255, 153, 255));
        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255)));
        jXLabel1.setText("                         VIEW  STUDENT");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 90));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "RegistrationID", "First Name", "Last Name", "DOB", "Phone", "Address", "NIC", "Batch"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 890, 270));

        btnView.setBackground(new java.awt.Color(0, 0, 102));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 100, 40));

        btnCancel.setBackground(new java.awt.Color(0, 0, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
         try {
         ArrayList<StudentDTO> alStudents = StudentController.getAllStudents();
         DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();
         dtm.setRowCount(0);
         for (StudentDTO student : alStudents) {
         Object[] rowData = {student.getStudentID(),
         student.getRegistrationID(),
         student.getLastName(),
         student.getLastName(),
         student.getDob(),
         student.getPhone(),
         student.getAddress(),
         student.getNic(),
         student.getSchool()
         };
         dtm.addRow(rowData);
         }// TODO add your handling code here:
         } catch (Exception ex) {
         Logger.getLogger(ViewStudentForm.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        
    }//GEN-LAST:event_btnViewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private javax.swing.JTable tblStudent;
    // End of variables declaration//GEN-END:variables
}
