package com.rumi.utill;

import com.rumi.view.CheckFee;
import com.rumi.view.CheckPayment;
import com.rumi.view.ClassView;
import com.rumi.view.FeeView;
import com.rumi.view.PaymentView;
import com.rumi.view.StudentView;
import com.rumi.view.TeacherView;
import com.rumi.view.UserView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CommonMenu {

    public void getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu home = new JMenu("Home");
        JMenuItem teacher = new JMenuItem("Teacher");
        teacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new TeacherView().setVisible(true);
            }
        });
        JMenuItem student = new JMenuItem("Student");
        student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new StudentView().setVisible(true);
            }
        });
        JMenuItem fees = new JMenuItem("Fees");
        fees.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new FeeView().setVisible(true);
            }
        });
        JMenuItem payment = new JMenuItem("Payment");
        payment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PaymentView().setVisible(true);
            }
        });

        home.add(teacher);
        home.add(student);
        home.add(fees);
        home.add(payment);

        JMenu setting = new JMenu("Settings");
        JMenuItem user = new JMenuItem("Create User");
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new UserView().setVisible(true);
            }
        });

        JMenuItem cls = new JMenuItem("Create Class");
        cls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ClassView().setVisible(true);
            }
        });

        setting.add(user);
        setting.add(cls);

        JMenu Summary = new JMenu("Summary");
        JMenuItem checkFee = new JMenuItem("Check Fees");
        checkFee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new CheckFee().setVisible(true);
            }
        });
        JMenuItem checkPayment = new JMenuItem("Check Payment");
        checkPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new CheckPayment().setVisible(true);
            }
        });

        Summary.add(checkFee);
        Summary.add(checkPayment);

        JMenuItem logout = new JMenuItem("Log Out");
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);

            }
        });
        setting.add(logout);
        
        menuBar.add(home);
        menuBar.add(setting);
        menuBar.add(Summary);
        menuBar.add(logout);

        f.setJMenuBar(menuBar);
    }

}
