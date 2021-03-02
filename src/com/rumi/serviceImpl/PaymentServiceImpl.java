package com.rumi.serviceImpl;

import com.rumi.connection.DbConnection;
import com.rumi.projo.Payment;
import com.rumi.projo.Teacher;
import com.rumi.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentServiceImpl extends CommonServiceAdapter<Payment> {

    static Connection conn = DbConnection.getInstance();

    @Override
    public void save(Payment t) {
        String sql = "insert into payment(id, teacher_id, year, month, salary) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getId());
            ps.setInt(2, t.getTeacher().getId());
            ps.setInt(3, t.getMonth());
            ps.setInt(4, t.getYear());
            ps.setInt(5, t.getSalary());

            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void edit(Payment t) {
        String sql = "insert into payment(id, teacher_id, year, month, salary) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getId());
            ps.setInt(2, t.getTeacher().getId());
            ps.setInt(3, t.getMonth());
            ps.setInt(4, t.getYear());
            ps.setInt(5, t.getSalary());

            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(int id) {
        String sql = "delete from payment where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Payment get(int id) {
        Payment payment = null;
        String sql = "select * from payment where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                payment = new Payment(rs.getInt("id"), new Teacher(rs.getInt("teacher_id")),
                        rs.getInt("month"), rs.getInt("year"), rs.getInt("salary"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return payment;
    }

    @Override
    public List<Payment> getList() {
        List<Payment> payments = new ArrayList<>();
        String sql = "select * from payment";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Payment payment = new Payment(rs.getInt("id"),new Teacher(rs.getInt("teacher_id")),
                        rs.getInt("month"), rs.getInt("year"), rs.getInt("salary"));
                payments.add(payment);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return payments;
    }

    @Override
    public void createTable() {
        String sql = "create table payment(id int(5) primary key auto_increment,"
                + "teacher_id int(7),"
                + "month int(20),"
                + "year int(20),"
                + "salary int(50),"
                + "FOREIGN KEY(teacher_id) REFERENCES teacher(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public List<Payment> getListById() {
        List<Payment> payments = new ArrayList<>();
        String sql = "select * from payment where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Payment payment = new Payment(rs.getInt("id"), new Teacher(rs.getInt("teacher_id")) ,
                        rs.getInt("month"), rs.getInt("year"), rs.getInt("salary"));
                payments.add(payment);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return payments;
    }

    @Override
    public List<Payment> getByTeacherId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
