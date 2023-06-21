/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import javax.swing.JOptionPane;

/**
 *
 * @author LEGION
 */
public class Koneksi {

    String url = "jdbc:mysql://localhost/db_perpustakaan";
    String username = "root";
    String password = "";

    public java.sql.Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return java.sql.DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) {
        Koneksi k = new Koneksi();
        try {
            k.getConnection();
            JOptionPane.showMessageDialog(null, "Koneksi OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }
}
