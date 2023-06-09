/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.view;

import edu.ijse.IdGenarater.IdGenarator;
import edu.ijse.gdse43.core.dto.BatchDTO;
import edu.ijse.gdse43.custom.controller.BatchController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEll
 */
public class BatchForm extends javax.swing.JFrame {

    /**
     * Creates new form BatchForm
     */
    public BatchForm() {
        initComponents();
        loadSystemDate();
        loadSysteTime();
        loadBatchID();
        txtBatchID.setEditable(false);
        txtBatchNo.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TitleLabel = new org.jdesktop.swingx.JXLabel();
        jPanel1 = new javax.swing.JPanel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel23 = new org.jdesktop.swingx.JXLabel();
        jXLabel24 = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbatch = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        txtBatchID = new javax.swing.JTextField();
        txtBatchNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        ButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(204, 204, 204));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Actions-window-close-icon.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        TitlePanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 60, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        TitlePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 10, 60, 60));

        TitleLabel.setBackground(new java.awt.Color(0, 0, 153));
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/if_graduated_44907.png"))); // NOI18N
        TitleLabel.setText("          RASANYA  INSTITUTE");
        TitleLabel.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        TitleLabel.setOpaque(true);
        TitlePanel.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        getContentPane().add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 910, 130));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jXLabel1.setText("                                                BATCH");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jXLabel1.setOpaque(true);
        jPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 90));

        jXLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel23.setText("Batch ID");
        jXLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 113, 25));

        jXLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel24.setText("Batch No");
        jXLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 113, 25));

        tblbatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BatchID", "BatchNo"
            }
        ));
        jScrollPane1.setViewportView(tblbatch);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 90));

        btnCancel.setBackground(new java.awt.Color(0, 0, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 100, 40));

        btnView.setBackground(new java.awt.Color(0, 0, 102));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 100, 40));

        txtBatchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtBatchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 150, 30));

        txtBatchNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtBatchNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 150, 30));

        btnAdd.setBackground(new java.awt.Color(0, 0, 102));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 910, 670));

        ButtonPanel.setBackground(new java.awt.Color(102, 102, 102));
        ButtonPanel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Time");
        ButtonPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date");
        ButtonPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 20));

        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });
        ButtonPanel.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 90, -1));

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        ButtonPanel.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 90, -1));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Home-icon.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        ButtonPanel.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 11, 84, 85));

        getContentPane().add(ButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 800));

        setSize(new java.awt.Dimension(1100, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure want to cancel");
        if (response == 0) {
            
            txtBatchNo.setText("");
            
            txtBatchNo.requestFocus();
        }else if(response==1){
            
        }else if(response==2){
            
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        try {
            ArrayList<BatchDTO> alBatches = BatchController.getAllBatches();
            DefaultTableModel dtm = (DefaultTableModel) tblbatch.getModel();
            dtm.setRowCount(0);
            for (BatchDTO batch : alBatches) {
                Object[] rowData = {batch.getBatchID(),
                    batch.getBatchNo()};
                    
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(BatchForm.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            BatchDTO batch = new BatchDTO(
                    txtBatchID.getText(),
                    txtBatchNo.getText());
            
            
            boolean result = BatchController.addBatch(batch);
            if(result){
                JOptionPane.showMessageDialog(this, "Batch has been successfully added");
                txtBatchID.setText(IdGenarator.getNewID("Batch", "BatchID", "B"));
                txtBatchID.setText("");
            }else{
                 JOptionPane.showMessageDialog(this, "Batch hasn't been successfully added");
                 txtBatchNo.requestFocus();
            }
        } catch (Exception ex) {
            Logger.getLogger(BatchForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtBatchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchIDActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchIDActionPerformed

    private void txtBatchNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchNoActionPerformed
btnAdd.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchNoActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        int response=JOptionPane.showConfirmDialog(this,"Are you sure want to exit");
        if(response==0){
            System.exit(0);
        }else if(response==1){
        }else if(response==2){

        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BatchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatchForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private org.jdesktop.swingx.JXLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel23;
    private org.jdesktop.swingx.JXLabel jXLabel24;
    private javax.swing.JTable tblbatch;
    private javax.swing.JTextField txtBatchID;
    private javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    private void loadSystemDate() {
        Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String FormatDate = df.format(d1);
        txtDate.setText(FormatDate);
    }

    private void loadSysteTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d1 = new Date();
                SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss a");
                String FormatDate = df.format(d1);
                txtTime.setText(FormatDate);
            }
        }).start();
    }

    private void loadBatchID() {
        try {
            txtBatchID.setText(IdGenarator.getNewID("Batch","BatchID", "B"));
        } catch (IOException ex) {
            Logger.getLogger(BatchForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BatchForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BatchForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
