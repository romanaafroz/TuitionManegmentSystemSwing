package com.rumi.serviceImpl;

import com.rumi.connection.DbConnection;
import com.rumi.projo.Classes;
import com.rumi.projo.Student;
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

public class StudentServiceImpl extends CommonServiceAdapter<Student> {

    static Connection conn = DbConnection.getInstance();

    @Override
    public void save(Student t) {
        String sql = "insert into student(name,cls_id, teacher_id,status,monthlyFee,course,contact,address) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setInt(2, t.getCls().getId());
            ps.setInt(3, t.getTeacher().getId());
            ps.setBoolean(4, t.isStatus());
            ps.setInt(5, t.getMonthlyFee());
            ps.setString(6, t.getCourse());
            ps.setString(7, t.getContact());
            ps.setString(8, t.getAddress());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from student where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Student get(int id) {
        Student student = null;
        String sql = "select * from student where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student(rs.getInt("id"), rs.getString("name"), new Classes(rs.getInt("cls_id")),
                        new Teacher(rs.getInt("teacher_id")), rs.getBoolean("status"),
                        rs.getInt("monthlyFee"), rs.getString("course"), rs.getString("contact"),
                        rs.getString("address"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }

    @Override
    public List<Student> getList() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from student";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt("id"), rs.getString("name"), new Classes(rs.getInt("cls_id")), new Teacher(rs.getInt("teacher_id")),
                        rs.getBoolean("status"), rs.getInt("monthlyFee"), rs.getString("course"), rs.getString("contact"), rs.getString("address"));
                students.add(student);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return students;
    }

    @Override
    public void createTable() {
        String sql = "create table student (id int(7) primary key auto_increment,"
                + " name varchar(50),"
                + " cls_id int(7),"
                + " teacher_id int(7),"
                + " status boolean,"
                + " monthlyFee int(9),"
                + " course varchar(50),"
                + " contact varchar(50),"
                + " address varchar(500),"
                + "FOREIGN KEY (cls_id) REFERENCES classes(id),"
                + "FOREIGN KEY (teacher_id) REFERENCES teacher(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Student getStudentByIdAndTeacher(String student_name, int teacher_id) {
        Student student = null;
        String sql = "select * from student where name = ? and teacher_id=?, classes_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student_name);
            ps.setInt(2, teacher_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student(rs.getInt("id"), rs.getString("name"), new Classes(rs.getInt("classes_id")), new Teacher(rs.getInt("teacher_id")), rs.getBoolean("status"),
                        rs.getInt("monthlyFee"), rs.getString("course"), rs.getString("contact"), rs.getString("address"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }

    @Override
    public List<Student> getByTeacherId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByName(String name) {
       Student student = null;
        String sql = "select * from student where name = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student(rs.getInt("id"), rs.getString("name"), new Classes(rs.getInt("cls_id")),
                        new Teacher(rs.getInt("teacher_id")), rs.getBoolean("status"),
                        rs.getInt("monthlyFee"), rs.getString("course"), rs.getString("contact"),
                        rs.getString("address"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
    
    
}
