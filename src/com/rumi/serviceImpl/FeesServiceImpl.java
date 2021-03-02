package com.rumi.serviceImpl;

import com.rumi.connection.DbConnection;
import com.rumi.projo.Fee;
import com.rumi.projo.Student;
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

public class FeesServiceImpl extends CommonServiceAdapter<Fee> {

    static Connection conn = DbConnection.getInstance();

    @Override
    public void save(Fee t) {
        String sql = "insert into fee(student_id, name, cls, month, year, amount) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getStudentId().getId());
            ps.setString(2, t.getName());
            ps.setString(3, t.getCls());
            ps.setInt(4, t.getMonth());
            ps.setInt(5, t.getYear());
            ps.setInt(6, t.getAmount());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(FeesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void edit(Fee t) {
        String sql = "update fee set student_id=?, name=?,cls=?, year=?, month=?, amount=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getStudentId().getId());
            ps.setString(2, t.getName());
            ps.setString(3, t.getCls());
            ps.setInt(4, t.getYear());
            ps.setInt(5, t.getMonth());
            ps.setInt(6, t.getAmount());
            ps.setInt(7, t.getId());

            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(FeesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from fee where student_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(FeesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Fee> getList() {
        List<Fee> fees = new ArrayList<>();
        String sql = "select * from fee";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Fee fee = new Fee(rs.getInt("id"), new Student(rs.getInt("student_id")), rs.getString("name"), rs.getString("cls"), rs.getInt("month"), rs.getInt("year"), rs.getInt("amount"));
                fees.add(fee);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FeesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fees;
    }

    @Override
    public void createTable() {
        String sql = "create table fee(id int(5) primary key auto_increment,"
                + "student_id int(7),"
                + "name varchar(50),"
                + "cls varchar(50),"
                + "month int(50),"
                + "year int(50),"
                + "amount int(20),"
                + "FOREIGN KEY(student_id) REFERENCES Student(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<Fee> getByStudentId(int id) {
         List<Fee> fees = new ArrayList<>();
        String sql = "select * from fee where student_id=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {    
                Fee fee= new Fee(rs.getInt("id"), new Student(rs.getInt("student_id")),
                        rs.getString("name"), rs.getString("cls"),
                        rs.getInt("year"), rs.getInt("month"), rs.getInt("amount"));
                fees.add(fee);
            }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(FeesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return fees;

    }

    @Override
    public List<Fee> getByTeacherId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    

}
