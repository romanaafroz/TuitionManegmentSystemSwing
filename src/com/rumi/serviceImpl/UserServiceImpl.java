
package com.rumi.serviceImpl;

import com.rumi.connection.DbConnection;
import com.rumi.projo.User;
import com.rumi.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UserServiceImpl extends CommonServiceAdapter<User> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(User t) {
        String sql = "insert into user(name, userid, password, type) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getUserid());
            ps.setString(3, t.getPassword());
            ps.setString(4, t.getType());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void edit(User t) {
        String sql = "update user set name=?,userid=?,password=?, type=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getUserid());
            ps.setString(3, t.getPassword());
            ps.setString(4, t.getType());
            ps.setInt(5, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User get(int id) {
        User user = null;
        String sql = "select * from user where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("userid"),
                        rs.getString("password"), rs.getString("type"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    @Override
    public List<User> getList() {
        List<User> users = new ArrayList<>();
        String sql = "select * from user";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("userid"),
                        rs.getString("password"),  rs.getString("type"));
                users.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;
    }

    @Override
    public void createTable() {
        String sql= "create table user(id int(5) primary key auto_increment,"
                + "name varchar(50) not null,"
                + "userid varchar(50) unique not null,"
                + "password varchar(50) not null,"
                + "type varchar(500) not null)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
      @Override
    public User getUserByUsernameAndPassword(String userid, String password) {
        User user = null;
        String sql = "select * from user where userid=? and password=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userid);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("userid"),
                        rs.getString("password"), rs.getString("type"));
            }

        } catch (SQLException ex) {
            user = null;
        }
        return user;
    }

    @Override
    public List<User> getByTeacherId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
