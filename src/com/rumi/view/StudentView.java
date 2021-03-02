package com.rumi.view;

import com.rumi.projo.Classes;
import com.rumi.projo.Student;
import com.rumi.projo.Teacher;
import com.rumi.service.CommonService;
import com.rumi.service.CommonServiceAdapter;
import com.rumi.serviceImpl.ClassesServiceImpl;
import com.rumi.serviceImpl.StudentServiceImpl;
import com.rumi.serviceImpl.TeacherServiceImpl;
import com.rumi.utill.CommonMenu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class StudentView extends javax.swing.JFrame {

    CommonService commonService = new StudentServiceImpl();
    CommonService teacherService = new TeacherServiceImpl();
    CommonService classesService = new ClassesServiceImpl();
    private Classes classes;

    public StudentView() {
        initComponents();
        displayDataIntoTable();
        displayClassesToCombobox();
        displayTeacherToCombobox();
        CommonMenu commonMenu = new CommonMenu();
        commonMenu.getCommonMenu(this);
    }

    private void displayClassesToCombobox() {
        cmbCls.addItem("Select Classes");
        List<Classes> list = classesService.getList();
        for (Classes c : list) {
            cmbCls.addItem(c.getCls());
        }
    }

    private void displayTeacherToCombobox() {
        cmbTeacher.addItem("Select Teacher");
        List<Teacher> list = teacherService.getList();
        for (Teacher t : list) {
            cmbTeacher.addItem(t.getName());
        }
    }

    public void reset() {
        txtName.setText(null);
        cmbCls.setSelectedIndex(0);
        cmbTeacher.setSelectedIndex(0);
        rActive.isSelected();
        rInActive.isSelected();
        cmbFee.setSelectedIndex(0);
        cmbCourse.setSelectedIndex(0);
        txtContact.setText(null);
        txtAddress.setText(null);
    }

    public void displayDataIntoTable() {
        DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
        model.setRowCount(0);
        Object[] row = new Object[8];
        List<Student> list = commonService.getList();
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            Classes classes = (Classes) classesService.get(list.get(i).getCls().getId());
            Teacher teacher = (Teacher) teacherService.get(list.get(i).getTeacher().getId());
            row[2] = teacher.getName();
            row[3] = list.get(i).isStatus();
            row[4] = list.get(i).getMonthlyFee();
            row[5] = list.get(i).getCourse();
            row[6] = list.get(i).getContact();
            row[7] = list.get(i).getAddress();
            model.addRow(row);
        }

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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        cmbCourse = new javax.swing.JComboBox<>();
        cmbTeacher = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rActive = new javax.swing.JRadioButton();
        rInActive = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDisplay = new javax.swing.JTable();
        cmbFee = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmbCls = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jTextField1.setText("Add Student");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 200, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 70, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Status");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 70, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Teacher");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 70, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Course");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 70, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("MonthlyFee");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 100, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 70, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Contact");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 70, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 180, 22));

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 180, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 180, 22));

        txtContact.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 180, -1));

        cmbCourse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monthly", "Yearly", "HalfYearly" }));
        getContentPane().add(cmbCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 180, 22));

        cmbTeacher.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTeacherActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 180, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 640, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, -1, -1));

        rActive.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rActive.setText("Active");
        getContentPane().add(rActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        rInActive.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rInActive.setText("Inactive");
        getContentPane().add(rInActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 145, -1));

        tbDisplay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Class", "Teacher", "Status", "MonthlyFee", "Course", "Contact", "Address"
            }
        ));
        tbDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDisplay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 780, 460));

        cmbFee.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbFee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500", "1000", "1500", "2000", "2500", "5000", "10000" }));
        getContentPane().add(cmbFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 180, -1));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Class");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 70, -1));

        cmbCls.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(cmbCls, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDisplayMouseClicked
        // TODO add your handling code here:
        TableModel model = tbDisplay.getModel();
        int i = tbDisplay.getSelectedRow();
        txtId.setText(String.valueOf(model.getValueAt(i, 0)));
        txtName.setText(String.valueOf(model.getValueAt(i, 1)));
        cmbFee.setSelectedItem(model.getValueAt(i, 2));
        cmbCourse.setSelectedItem(model.getValueAt(i, 3));
        txtContact.setText(String.valueOf(model.getValueAt(i, 4)));
        txtAddress.setText(String.valueOf(model.getValueAt(i, 5)));
    }//GEN-LAST:event_tbDisplayMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //System.out.println("cmbTeacher.getSelectedIndex();" + cmbTeacher.getSelectedIndex());

        boolean status = false;
        if (rActive.isSelected()) {
            status = true;
        } else {
            status = false;
        }
         String cls = cmbCls.getSelectedItem().toString();
        Classes clss =  (Classes) classesService.getByName(cls);
        String name = cmbTeacher.getSelectedItem().toString();
        Teacher teacher = (Teacher) teacherService.getByName(name);
        Student student = new Student(txtName.getText(), clss, teacher, status, Integer.parseInt(cmbFee.getSelectedItem().toString()), cmbCourse.getSelectedItem().toString(), txtContact.getText(), txtAddress.getText());

        commonService.save(student);
        JOptionPane.showMessageDialog(rootPane, "Succeessfully Added");
        reset();
        displayDataIntoTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        reset();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //DashboardView dash = new DashboardView();
        this.setVisible(true);
        // this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Are you Sure?");
        if (i == 0) {
            commonService.delete(Integer.parseInt(txtId.getText().trim()));
            displayDataIntoTable();
            JOptionPane.showMessageDialog(rootPane, "Succeessfully Deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTeacherActionPerformed

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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbCls;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JComboBox<String> cmbFee;
    private javax.swing.JComboBox<String> cmbTeacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rActive;
    private javax.swing.JRadioButton rInActive;
    private javax.swing.JTable tbDisplay;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
