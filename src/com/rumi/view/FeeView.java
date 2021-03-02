package com.rumi.view;

import com.rumi.projo.Classes;
import com.rumi.projo.Fee;
import com.rumi.projo.Student;
import com.rumi.service.CommonService;
import com.rumi.serviceImpl.ClassesServiceImpl;
import com.rumi.serviceImpl.FeesServiceImpl;
import com.rumi.serviceImpl.StudentServiceImpl;
import com.rumi.utill.CommonMenu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FeeView extends javax.swing.JFrame {

    public FeeView() {
        initComponents();
        displayDataIntoTable();
    }

    CommonService commonService = new FeesServiceImpl();
    CommonService studentService = new StudentServiceImpl();
    CommonService clsService = new  ClassesServiceImpl();

   
    public void reset() {
        txtId.setText(null);
        txtClass.setText(null);
        txtClass.setText(null);
        txtAmount.setText(null);
    }

    public void displayDataIntoTable() {

        DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        List<Fee> list = commonService.getList();
        for (int i = 0; i < list.size(); i++) {
             row[0] = list.get(i).getId();
             Student student = (Student) studentService.get(list.get(i).getStudentId().getId());
            row[1] = student.getName();
            row[2] = list.get(i).getName();
            row[3] = list.get(i).getCls();
            row[4] = list.get(i).getMonth();
            row[5] = list.get(i).getYear();
            row[6] = list.get(i).getAmount();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtClass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDisplay = new javax.swing.JTable();
        txtClose = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtYear = new com.toedter.calendar.JYearChooser();
        txtMonth = new com.toedter.calendar.JMonthChooser();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jTextField1.setText("Student's Fee");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 220, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 110, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Month");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 60, -1));

        txtClass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 70, -1));

        txtAmount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 180, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 50, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Class");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Year");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 60, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 100, 25));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, -1, -1));

        btnEdit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 79, 25));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 100, 25));

        tbDisplay.setBorder(new javax.swing.border.MatteBorder(null));
        tbDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Class", "Section", "Month", "Year", "Amount"
            }
        ));
        tbDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDisplay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 840, 402));

        txtClose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtClose.setText("Close");
        txtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCloseActionPerformed(evt);
            }
        });
        getContentPane().add(txtClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 600, 100, 20));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 600, -1, -1));
        getContentPane().add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));
        getContentPane().add(txtMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = txtId.getText();
         Student student = (Student) studentService.get(Integer.parseInt(txtId.getText()));
        Fee fee = new Fee(student, txtName.getText(), txtClass.getText(), txtMonth.getMonth(), txtYear.getYear(), Integer.parseInt(txtAmount.getText()));
        
        commonService.save(fee);
        JOptionPane.showMessageDialog(rootPane, "Successfully Added");
        displayDataIntoTable();
        reset();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDisplayMouseClicked

    }//GEN-LAST:event_tbDisplayMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
     
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
         Student student = (Student) studentService.get(Integer.parseInt(txtId.getText()));
        txtName.setText(student.getName());
         Classes cls= (Classes) clsService.get(student.getId());
            String clss = cls.getCls();
            txtClass.setText(clss);
        txtAmount.setText(String.valueOf(student.getMonthlyFee()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Data has been Found");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbDisplay;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtClass;
    private javax.swing.JButton txtClose;
    private javax.swing.JTextField txtId;
    private com.toedter.calendar.JMonthChooser txtMonth;
    private javax.swing.JTextField txtName;
    private com.toedter.calendar.JYearChooser txtYear;
    // End of variables declaration//GEN-END:variables

}
