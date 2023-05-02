/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.view;

import edu.ijse.gdse43.custom.controller.TeacherController;
import edu.ijse.gdse43.core.dto.TeacherDTO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEll
 */
public class ViewTeacherForm extends javax.swing.JPanel {

    /**
     * Creates new form ViewTeacherForm
     */
    public ViewTeacherForm() throws Exception {
        initComponents();
        //loadTeacherIds();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeacher = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jXLabel1.setText("                               VIEW  TEACHER");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 90));

        tblTeacher.setAutoCreateRowSorter(true);
        tblTeacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tblTeacher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Name", "Phone", "Address", "National ID", "Subject"
            }
        ));
        tblTeacher.setGridColor(new java.awt.Color(0, 0, 102));
        tblTeacher.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblTeacher.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tblTeacher);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 820, 340));

        btnCancel.setBackground(new java.awt.Color(0, 0, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 100, 40));

        btnView.setBackground(new java.awt.Color(0, 0, 102));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       
        int response = JOptionPane.showConfirmDialog(this, "Are you sure want to cancel");
        if (response == 0) {
            
        }else if(response==1){
            
        }else if(response==2){
            
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        try {
            ArrayList<TeacherDTO> alTeachers = TeacherController.getAllTeachers();
            DefaultTableModel dtm = (DefaultTableModel) tblTeacher.getModel();
            dtm.setRowCount(0);
            for (TeacherDTO teacher : alTeachers) {
                Object[] rowData = {teacher.getTeacherID(),
                    teacher.getName(),
                    teacher.getPhone(),
                    };
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewTeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private javax.swing.JTable tblTeacher;
    // End of variables declaration//GEN-END:variables

   /*private void loadTeacherIds() throws Exception {
        ArrayList<TeacherDTO> teacherIds = TeacherController.getAllTeachers();
        for (TeacherDTO teacherId : teacherIds) {
            teacherIdComboBox.addItem(teacherId.getTeacherID());

        }

    }*/
}