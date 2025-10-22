/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ryzen
 */
package coffeshopproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;

    public static Connection getKoneksi() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_coffeeshop?useSSL=false&serverTimezone=UTC";
                String user = "root";
                String pass = ""; // biasanya Laragon default blank
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                System.err.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}

