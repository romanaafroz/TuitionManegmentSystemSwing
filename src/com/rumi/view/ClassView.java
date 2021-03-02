/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rumi.view;

import com.rumi.projo.Classes;
import com.rumi.service.CommonService;
import com.rumi.serviceImpl.ClassesServiceImpl;
import com.rumi.utill.CommonMenu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ASUS
 */
public class ClassView extends javax.swing.JFrame {

    CommonService commonService = new ClassesServiceImpl();

    public ClassView() {
        initComponents();
        displayDataIntoTable();
        CommonMenu commonMenu = new CommonMenu();
        commonMenu.getCommonMenu(this);
    }

    public void reset() {
        txtId.setText(null);
        txtCls.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCls = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDisplay = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 700));
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextField1.setText("Add Class");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(280, 30, 161, 48);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Class");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 290, 60, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 210, 17, 22);

        txtCls.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtCls);
        txtCls.setBounds(240, 280, 180, 22);

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtId);
        txtId.setBounds(240, 210, 180, 28);

        tbDisplay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name"
            }
        ));
        tbDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDisplay);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 200, 500, 260);

        btnClose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose);
        btnClose.setBounds(860, 500, 79, 25);

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(120, 500, 65, 31);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(330, 500, 81, 25);

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(590, 500, 79, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayDataIntoTable() {
        DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        List<Classes> list = commonService.getList();
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getCls();
            model.addRow(row);
        }
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Classes cls = new Classes(txtCls.getText().trim());
        commonService.save(cls);
        displayDataIntoTable();
        JOptionPane.showMessageDialog(null, "Successfully Added");
        reset();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDisplayMouseClicked
        TableModel model = tbDisplay.getModel();
        int i = tbDisplay.getSelectedRow();
        txtId.setText(String.valueOf(model.getValueAt(i, 0)));
        txtCls.setText(String.valueOf(model.getValueAt(i, 1)));
    }//GEN-LAST:event_tbDisplayMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Are you Sure?");
        if (i == 0) {
            commonService.delete(Integer.parseInt(txtId.getText().trim()));
            displayDataIntoTable();
            JOptionPane.showMessageDialog(rootPane, "Succeessfully Deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(ClassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbDisplay;
    private javax.swing.JTextField txtCls;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

}
