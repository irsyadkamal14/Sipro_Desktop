/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;

/**
 *
 * @author TOSHIBA
 */
public class Koneksi {
    public static Connection getConnection() {
        Connection conn = null;
//        String url = "jdbc:mysql://sql6.freemysqlhosting.net/sql6492283";
//        String user = "sql6492283";
//        String password = "B8n45VSHWZ";
          String url = "jdbc:mysql://localhost/sipro";
          String user = "root";
          String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

    public static void main(String[] args) {
        try {
            Connection c = Koneksi.getConnection();
            System.out.println(String.format("Connected to database %s " + "successfully.", c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    static class koneksi {

        public koneksi() {
        }
    }
    
}
