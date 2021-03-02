package com.rumi.serviceImpl;

import com.rumi.connection.DbConnection;
import com.rumi.projo.Classes;
import com.rumi.service.CommonServiceAdapter;
import static com.rumi.serviceImpl.TeacherServiceImpl.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassesServiceImpl extends CommonServiceAdapter<Classes> {

    static Connection conn = DbConnection.getInstance();

    @Override
    public void save(Classes t) {
        String sql = "insert into classes( class) values(?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getCls());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ClassesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Classes> getList() {
        List<Classes> classes = new ArrayList<>();
        String sql = "select * from classes";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Classes cls = new Classes(rs.getInt("id"), rs.getString("class"));
                classes.add(cls);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClassesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return classes;
    }

    @Override
    public Classes get(int id) {
        Classes cls = null;
        String sql = "select * from classes where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cls = new Classes(rs.getInt("id"), rs.getString("class"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClassesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cls;
    }

//    @Override
//    public void edit(Classes t) {
//        String sql = "update classes set name =? where id =?";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, t.getCls());
//            ps.setInt(3, t.getId());
//            ps.executeUpdate();
//            System.out.println("::::: Data Updated Successfully :::::");
//        } catch (SQLException ex) {
//            Logger.getLogger(ClassesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public void delete(int id) {
        String sql = "delete from classes where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ClassesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void createTable() {
        String sql = "create table classes(id int(5) primary key auto_increment,"
                + "class varchar(50) not null)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<Classes> getByTeacherId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Classes getByName(String name) {
       Classes cls = null;
        String sql = "select * from classes where class=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cls = new Classes(rs.getInt("id"), rs.getString("class"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClassesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cls;  }
    

}
