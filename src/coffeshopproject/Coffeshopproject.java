/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeshopproject;

/**
 *
 * @author Ryzen
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Coffeshopproject {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_coffeeshop";
        String user = "root";
        String pass = ""; // isi password MySQL kamu kalau ada

        try {
            // load driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // buat koneksi
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Koneksi BERHASIL!");
            System.out.println("Koneksi:" +conn);

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Koneksi GAGAL: " + e.getMessage());
        }
    }
}
    
       


    
    

    
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
   
        
       


