package com.rumi.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    private static Connection instance;

    public static Connection getInstance() {
        try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "1234");
            System.out.println(":::Connected:::");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return instance;
    }
}
