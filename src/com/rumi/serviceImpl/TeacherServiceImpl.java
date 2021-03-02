/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rumi.serviceImpl;

import com.rumi.connection.DbConnection;
import com.rumi.projo.Classes;
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


/**
 *
 * @author ASUS
 */
public class TeacherServiceImpl extends CommonServiceAdapter<Teacher> {

    static Connection conn = DbConnection.getInstance();

    @Override
    public void save(Teacher t) {
        String sql = "insert into teacher(name, gender, fname, cls_id, subject, contract, address) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getGender());
            ps.setString(3, t.getFname());
            ps.setInt(4, t.getCls().getId());
            ps.setString(5, t.getSubject());
            ps.setString(6, t.getContract());
            ps.setString(7, t.getAddress());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void createTable() {
        String sql = "create table teacher (id int(7) primary key auto_increment,"
                + " name varchar(50),"
                + " gender varchar(50),"
                + " fname varchar(50),"
                + " cls_id int(5),"
                + " subject varchar(50),"
                + " contract varchar(50),"
                + " address varchar(500),"
                + "FOREIGN KEY(cls_id) REFERENCES classes(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Teacher> getList() {
        List<Teacher> teachers = new ArrayList<>();
        String sql = "select * from teacher";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Teacher teacher = new Teacher(rs.getInt("id"), rs.getString("name"),
                       rs.getString("gender"), rs.getString("fname"),
                       new Classes(rs.getInt("cls_id")), rs.getString("subject"), 
                       rs.getString("contract"), rs.getString("address"));
               teachers.add(teacher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teachers;
    }

    @Override
    public Teacher get(int id) {
        Teacher teacher = null;
        String sql = "select * from teacher where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               teacher = new Teacher(rs.getInt("id"), rs.getString("name"),
                       rs.getString("gender"), rs.getString("fname"),
                       new Classes(rs.getInt("cls_id")), rs.getString("subject"), 
                       rs.getString("contract"), rs.getString("address"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teacher;
    }

    @Override
    public void edit(Teacher t) {
        String sql = "update teacher set name=?,gender=?,fname=?,cls_id=?,subject=?,contract=?,address=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getGender());
            ps.setString(3, t.getFname());
            ps.setInt(4, t.getCls().getId());
            ps.setString(5, t.getSubject());
            ps.setString(6, t.getContract());
            ps.setString(7, t.getAddress());
            ps.executeUpdate();
            System.out.println("::::: Data updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from teacher where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Teacher getTeacherByUsernameAndPassword(String username, String password) {
        Teacher teacher = null;
        String sql = "select * from teacher where username=? and password=? and status=true";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                teacher = new Teacher(rs.getInt("id"), rs.getString("name"), rs.getString("gender"), rs.getString("fname"),new Classes(rs.getInt("cls_id")), rs.getString("subject"), rs.getString("contract"), rs.getString("address"));
            }
        } catch (SQLException ex) {
            teacher = null;
        }
        return teacher;
    }

    @Override
    public Teacher getByName(String name) {
        Teacher teacher = null;
        String sql = "select * from teacher where name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                teacher = new Teacher(rs.getInt("id"), rs.getString("name"), rs.getString("gender"), rs.getString("fname"), new Classes(rs.getInt("cls_id")), rs.getString("subject"), rs.getString("contract"), rs.getString("address"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teacher;
    }

    @Override
    public List<Teacher> getByTeacherId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
