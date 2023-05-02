/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.view;

import edu.ijse.IdGenarater.IdGenarator;
import edu.ijse.gdse43.core.dto.ExamDTO;
import edu.ijse.gdse43.core.dto.ExamDetailsDTO;
import edu.ijse.gdse43.core.dto.SubjectDTO;
import edu.ijse.gdse43.custom.controller.ExamController;
import edu.ijse.gdse43.custom.controller.SubjectController;
import edu.ijse.gdse43.dao.db.DBConnection;
import edu.ijse.gdse43.util.Validation;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import lk.ijse.jasper.IJSEJasperViewer;
import lk.ijse.jasper.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DEll
 */
public class ExamForm extends javax.swing.JFrame {

    /**
     * Creates new form ExamForm
     */
    public ExamForm() {
        initComponents();
        loadSystemDate();
        loadSystemTime();
        loadSubjectNames();
        loadExamIds();
        txtExamID.setEditable(false);
        txtStudentID.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        TitlePanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TitleLabel = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jPanel1 = new javax.swing.JPanel();
        jXLabel21 = new org.jdesktop.swingx.JXLabel();
        jXLabel23 = new org.jdesktop.swingx.JXLabel();
        jXLabel24 = new org.jdesktop.swingx.JXLabel();
        jXLabel25 = new org.jdesktop.swingx.JXLabel();
        jXLabel26 = new org.jdesktop.swingx.JXLabel();
        txtExamID = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        txtMarks = new javax.swing.JTextField();
        txtExamTime = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jXLabel27 = new org.jdesktop.swingx.JXLabel();
        SubjectIDComboBox = new javax.swing.JComboBox();
        btnLogin4 = new javax.swing.JButton();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonPanel.setBackground(new java.awt.Color(102, 102, 102));
        ButtonPanel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonPanel.setMinimumSize(new java.awt.Dimension(200, 800));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(200, 800));
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

        jXLabel1.setBackground(new java.awt.Color(255, 153, 255));
        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255)));
        jXLabel1.setText("                                            EXAMS");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jXLabel1.setOpaque(true);
        getContentPane().add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 910, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel21.setText("Exam Time");
        jXLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 113, 25));

        jXLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel23.setText("Student ID");
        jXLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 113, 25));

        jXLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel24.setText("Subject Name");
        jXLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 113, 25));

        jXLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel25.setText("Marks");
        jXLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 113, 25));

        jXLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel26.setText("Exam Date");
        jXLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 113, 25));
        jPanel1.add(txtExamID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 230, 30));

        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 230, 30));

        txtMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarksActionPerformed(evt);
            }
        });
        txtMarks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarksKeyReleased(evt);
            }
        });
        jPanel1.add(txtMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, 30));
        jPanel1.add(txtExamTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 230, 30));

        btnAdd.setBackground(new java.awt.Color(0, 0, 102));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 100, 40));

        jXLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel27.setText("Exam ID");
        jXLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 113, 25));

        jPanel1.add(SubjectIDComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 230, 20));

        btnLogin4.setBackground(new java.awt.Color(0, 0, 102));
        btnLogin4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin4.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin4.setText("Cancel");
        btnLogin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 100, 40));
        jPanel1.add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 910, 580));

        setSize(new java.awt.Dimension(1100, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
           

            Date date = DateChooser.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = dateFormat.format(date);

            String subject = SubjectIDComboBox.getSelectedItem().toString();
            SubjectDTO SubjectName = SubjectController.searchSubjectName(subject);
            ExamDTO exam = new ExamDTO(txtExamID.getText(),
                    SubjectName.getSubjectID(),
                    Integer.parseInt(txtMarks.getText()));
            ExamDetailsDTO examDetails = new ExamDetailsDTO(
                    txtExamID.getText(),
                    txtStudentID.getText(),
                    format,
                   txtExamTime.getText());
            boolean result = ExamController.addExam(exam, examDetails);
            if (result) {
                JOptionPane.showMessageDialog(this, "Exam has been successfully added");
            } else {
                JOptionPane.showMessageDialog(this, "Exam hasn't been successfully added");
            }
            txtStudentID.setText("");
            txtMarks.setText("");
              txtExamID.setText(IdGenarator.getNewID("Exam", "ExamID", "E"));
        } catch (Exception ex) {
            Logger.getLogger(ExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtMarksKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarksKeyReleased

    }//GEN-LAST:event_txtMarksKeyReleased

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure want to exit");
        if (response == 0) {
            System.exit(0);
        } else if (response == 1) {
        } else if (response == 2) {

        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        txtMarks.requestFocus();
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void txtMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarksActionPerformed
       
    }//GEN-LAST:event_txtMarksActionPerformed

    private void btnLogin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin4ActionPerformed
      int response = JOptionPane.showConfirmDialog(this, "Are you sure want to cancel");
        if (response == 0) {
            
            txtStudentID.setText("");
            txtStudentID.requestFocus();
        }else if(response==1){
            
        }else if(response==2){
            
        }
    }//GEN-LAST:event_btnLogin4ActionPerformed

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
            java.util.logging.Logger.getLogger(ExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JComboBox SubjectIDComboBox;
    private org.jdesktop.swingx.JXLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogin4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel21;
    private org.jdesktop.swingx.JXLabel jXLabel23;
    private org.jdesktop.swingx.JXLabel jXLabel24;
    private org.jdesktop.swingx.JXLabel jXLabel25;
    private org.jdesktop.swingx.JXLabel jXLabel26;
    private org.jdesktop.swingx.JXLabel jXLabel27;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtExamID;
    private javax.swing.JTextField txtExamTime;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    private void loadSystemDate() {
        Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String FormatDate = df.format(d1);
        txtDate.setText(FormatDate);

    }

    private void loadSystemTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d1 = new Date();
                SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
                String FormatDate = df.format(d1);
                txtTime.setText(FormatDate);
            }
        }).start();
    }

    private void loadSubjectNames() {
        try {
            ArrayList<SubjectDTO> SubjectList = SubjectController.getAllSubjects();
            for (SubjectDTO SubjectName : SubjectList) {
                SubjectIDComboBox.addItem(SubjectName.getSubjectName());
            }
        } catch (Exception ex) {
            Logger.getLogger(ExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadExamIds() {
        try {
            txtExamID.setText(IdGenarator.getNewID("Exam", "ExamID", "E"));
        } catch (IOException ex) {
            Logger.getLogger(ExamForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExamForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}