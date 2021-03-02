package com.rumi.view;

import com.rumi.projo.User;
import com.rumi.service.CommonService;
import com.rumi.serviceImpl.UserServiceImpl;
import com.rumi.utill.CommonMenu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class UserView extends javax.swing.JFrame {

    public UserView() {
        initComponents();
        displayDataIntoTable();
        CommonMenu commonMenu = new CommonMenu();
        commonMenu.getCommonMenu(this);
        this.setExtendedState(MAXIMIZED_BOTH);
    
    }
    CommonService commonService = new UserServiceImpl();

    public void reset() {
        txtName.setText(null);
        txtPass.setText(null);
        txtUser.setText(null);
        cmbType.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        tztId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextField1.setText("User");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 40, 90, 48);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 320, 90, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 380, 70, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("UserId");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 260, 70, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 200, 70, 30);

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtUser);
        txtUser.setBounds(290, 260, 190, 22);

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(290, 200, 190, 28);

        btnClose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose);
        btnClose.setBounds(1180, 490, 100, 31);

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(130, 490, 100, 31);

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(930, 490, 100, 31);

        txtPass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtPass);
        txtPass.setBounds(290, 320, 190, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 150, 70, 30);

        tztId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(tztId);
        tztId.setBounds(290, 150, 190, 28);

        tblDisplay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "UserId", "Password", "Type"
            }
        ));
        tblDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplay);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 30, 720, 420);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Delete");
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 490, 90, 25);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Edit");
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 490, 79, 25);

        cmbType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Operator" }));
        getContentPane().add(cmbType);
        cmbType.setBounds(290, 380, 190, 28);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void displayDataIntoTable() {
       
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        List<User> list = commonService.getList();
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getUserid();
            row[3] = list.get(i).getPassword();
            row[4] = list.get(i).getType();

            model.addRow(row);
        }
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
         User user = new User(txtName.getText().trim(), txtUser.getText().trim(), txtPass.getText().trim(), cmbType.getSelectedItem().toString().trim());
        commonService.save(user);
      
        JOptionPane.showMessageDialog(null, "Succeessfully Added");
        reset();
        displayDataIntoTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tblDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayMouseClicked
        TableModel model = tblDisplay.getModel();
        int i = tblDisplay.getSelectedRow();
        tztId.setText(String.valueOf(model.getValueAt(i, 0)));
        txtName.setText(String.valueOf(model.getValueAt(i, 1)));
        txtUser.setText(String.valueOf(model.getValueAt(i, 2)));
        txtPass.setText(String.valueOf(model.getValueAt(i, 3)));
        cmbType.setSelectedIndex((int) model.getValueAt(i, 4));

    }//GEN-LAST:event_tblDisplayMouseClicked

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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField tztId;
    // End of variables declaration//GEN-END:variables

}
