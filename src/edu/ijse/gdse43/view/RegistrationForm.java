/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author DEll
 */
public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form StudentForm
     */
    public RegistrationForm() {
        initComponents();
        loadSystemDate();
        loadSystemTime();
        MainPanel.setVisible(true);
        ButtonPanel.setVisible(true);
        TitlePanel.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnPayment = new javax.swing.JButton();
        btnRegistration = new javax.swing.JButton();
        btnUpadeteStudent = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        TitlePanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TitleLabel = new org.jdesktop.swingx.JXLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.setMinimumSize(new java.awt.Dimension(900, 700));
        MainPanel.setPreferredSize(new java.awt.Dimension(900, 700));
        MainPanel.add(ImageLabel);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/images (1).jpg"))); // NOI18N
        MainPanel.add(jLabel4);

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 910, 670));

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

        btnPayment.setBackground(new java.awt.Color(0, 51, 153));
        btnPayment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPayment.setForeground(new java.awt.Color(255, 255, 255));
        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        ButtonPanel.add(btnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 190, 50));

        btnRegistration.setBackground(new java.awt.Color(0, 51, 153));
        btnRegistration.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Add User Male_48px.png"))); // NOI18N
        btnRegistration.setText("Registration");
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });
        ButtonPanel.add(btnRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 190, 50));

        btnUpadeteStudent.setBackground(new java.awt.Color(0, 51, 153));
        btnUpadeteStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpadeteStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnUpadeteStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Edit Property_48px.png"))); // NOI18N
        btnUpadeteStudent.setText("Edit ");
        btnUpadeteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpadeteStudentActionPerformed(evt);
            }
        });
        ButtonPanel.add(btnUpadeteStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 190, 50));

        btnViewStudent.setBackground(new java.awt.Color(0, 51, 153));
        btnViewStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnViewStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Find User Male_48px.png"))); // NOI18N
        btnViewStudent.setText("View");
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });
        ButtonPanel.add(btnViewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 190, 50));

        btnDeleteStudent.setBackground(new java.awt.Color(0, 51, 153));
        btnDeleteStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDeleteStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Empty Trash_48px.png"))); // NOI18N
        btnDeleteStudent.setText("Remove ");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });
        ButtonPanel.add(btnDeleteStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 50));

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
        TitlePanel.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 908, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TitlePanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 910, 130));

        setSize(new java.awt.Dimension(1100, 868));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        
            AddRegistrationForm a2 = new AddRegistrationForm();
            MainPanel.removeAll();
            MainPanel.add(a2);
            MainPanel.repaint();
            MainPanel.revalidate();
            MainPanel.setVisible(true);
                       
        


    }//GEN-LAST:event_btnRegistrationActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        DeleteStudentForm a2 = new DeleteStudentForm();
        MainPanel.removeAll();
        MainPanel.add(a2);
        MainPanel.repaint();
        MainPanel.revalidate();
        MainPanel.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void btnUpadeteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpadeteStudentActionPerformed
        UpdateStudentForm a3 = new UpdateStudentForm();
        MainPanel.removeAll();
        MainPanel.add(a3);
        MainPanel.repaint();
        MainPanel.revalidate();
        MainPanel.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnUpadeteStudentActionPerformed

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        ViewStudentForm a4 = new ViewStudentForm();
        MainPanel.removeAll();
        MainPanel.add(a4);
        MainPanel.repaint();
        MainPanel.revalidate();
        MainPanel.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        try {
            new PaymentForm().setVisible(true);
            this.setVisible(false);// TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPaymentActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel MainPanel;
    private org.jdesktop.swingx.JXLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnRegistration;
    private javax.swing.JButton btnUpadeteStudent;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    void loadSystemDate() {
        Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String DateFormat = df.format(d1);
        txtDate.setText(DateFormat);
    }

    private void loadSystemTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d1 = new Date();
                SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss a");
                String DateFormat = df.format(d1);
                txtTime.setText(DateFormat);
            }

        }).start();
    }

}