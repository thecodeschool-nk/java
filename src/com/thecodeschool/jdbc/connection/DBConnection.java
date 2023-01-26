package com.thecodeschool.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection con = null;

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/product", "niraj", "pass1234");
        } catch (Exception e) {
            System.err.println(e);
        }
        return con;
    }

    public void close() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
