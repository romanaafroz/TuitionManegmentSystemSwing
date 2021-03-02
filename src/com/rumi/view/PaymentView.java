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
import javax.swing.table.TableModel;

public class PaymentView extends javax.swing.JFrame {

    public PaymentView() {
        initComponents();
        displayDataIntoTable();
        CommonMenu commonMenu = new CommonMenu();
        commonMenu.getCommonMenu(this);
    }
    CommonService commonService = new TeacherServiceImpl();
    CommonService paymentService = new PaymentServiceImpl();

    public void reset() {
        txtId.setText(null);
        txtName.setText(null);
        txtSalary.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDisplay = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtMonth = new com.toedter.calendar.JMonthChooser();
        txtYear = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jTextField1.setText("Teachers Payment");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 290, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 80, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Salary");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 80, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Year");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 80, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Month");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 80, -1));

        txtSalary.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 220, 22));

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 220, 22));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 220, 22));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Search");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 100, 25));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, -1));

        btnEdit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 79, 25));

        btnClose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 520, 100, 25));

        tbDisplay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Month", "Year", "Salary"
            }
        ));
        tbDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDisplay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 750, 350));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 100, 25));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, -1, -1));

        txtMonth.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 110, -1));
        getContentPane().add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void displayDataIntoTable() {

        DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        List<Payment> list = paymentService.getList();
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            Teacher teacher = (Teacher) commonService.get(list.get(i).getTeacher().getId());
            
            row[1] = teacher.getName();
            row[2] = list.get(i).getMonth();
            row[3] = list.get(i).getYear();
            row[4] = list.get(i).getSalary();

            model.addRow(row);
        }

    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int salary = Integer.parseInt(txtSalary.getText().trim());
        int year = txtYear.getYear();
        int month = txtMonth.getMonth();
        
        String name = txtName.getText();
        Teacher teacher = (Teacher) commonService.get(Integer.parseInt(txtId.getText()));

        Payment payment = new Payment(Integer.parseInt(txtId.getText().trim()), teacher, txtMonth.getMonth(), txtYear.getYear(), salary);
        paymentService.save(payment);
        displayDataIntoTable();
        JOptionPane.showMessageDialog(null, "Succeessfully Added");
        reset();


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String name = txtName.getText();
        Teacher teacher = (Teacher) commonService.get(Integer.parseInt(txtId.getText()));

        Payment payment = new Payment(Integer.parseInt(txtId.getText().trim()), teacher, txtMonth.getMonth(), txtYear.getYear(), Integer.parseInt(txtSalary.getText().trim()));
        paymentService.edit(payment);
        displayDataIntoTable();
        JOptionPane.showMessageDialog(null, "Succeessfully Updated");
        reset();
    }//GEN-LAST:event_btnEditActionPerformed

    private void tbDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDisplayMouseClicked
        TableModel model = tbDisplay.getModel();
        int i = tbDisplay.getSelectedRow();
        txtId.setText(String.valueOf(model.getValueAt(i, 0)));
        txtName.setText(String.valueOf(model.getValueAt(i, 1)));
        txtSalary.setText(String.valueOf(model.getValueAt(i, 2)));
    }//GEN-LAST:event_tbDisplayMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbDisplay;
    private javax.swing.JTextField txtId;
    private com.toedter.calendar.JMonthChooser txtMonth;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private com.toedter.calendar.JYearChooser txtYear;
    // End of variables declaration//GEN-END:variables
}
