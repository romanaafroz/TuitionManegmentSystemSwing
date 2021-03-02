/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rumi.view;

import com.rumi.projo.Payment;
import com.rumi.projo.Teacher;
import com.rumi.service.CommonService;
import com.rumi.serviceImpl.PaymentServiceImpl;
import com.rumi.serviceImpl.TeacherServiceImpl;
import com.rumi.utill.CommonMenu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Forryq
 */
public class CheckPayment extends javax.swing.JFrame {

    CommonService commonService= new PaymentServiceImpl();
    CommonService teacherService= new TeacherServiceImpl();
            
    public CheckPayment() {
        initComponents();
         this.setExtendedState(MAXIMIZED_BOTH);
        CommonMenu commonMenu = new CommonMenu();
        commonMenu.getCommonMenu(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtMonth = new com.toedter.calendar.JMonthChooser();
        txtYear = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 850));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Payment Summary");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 10, 230, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Year:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 80, 60, 22);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 130, 90, 31);

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Month", "Year", "Payment"
            }
        ));
        jScrollPane1.setViewportView(tblDisplay);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 202, 1570, 470);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText(" Month:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 80, 22);
        getContentPane().add(txtMonth);
        txtMonth.setBounds(130, 80, 111, 22);
        getContentPane().add(txtYear);
        txtYear.setBounds(350, 80, 51, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code 
        try {
         int month = txtMonth.getMonth();
        int year= txtYear.getYear();

        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        List<Payment> list = commonService.getListByMonthAndYear(month, year);
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            Teacher teacher = (Teacher) teacherService.get(list.get(i).getTeacher().getId());
            row[1] = teacher.getName();
            row[2] = list.get(i).getMonth();
            row[3] = list.get(i).getYear();
            row[4] = list.get(i).getSalary();
            model.addRow(row);
        }       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Data Has been Found");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisplay;
    private com.toedter.calendar.JMonthChooser txtMonth;
    private com.toedter.calendar.JYearChooser txtYear;
    // End of variables declaration//GEN-END:variables
}