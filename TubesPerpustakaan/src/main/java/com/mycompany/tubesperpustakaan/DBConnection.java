/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesperpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/pbo_perpus";
    private static final String USER = "root"; // Sesuaikan dengan MySQL
    private static final String PASSWORD = ""; // Jika pakai XAMPP, kosongkan

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("❌ Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        // Uji koneksi
        Connection conn = connect();
        if (conn != null) {
            System.out.println("Tes koneksi berhasil!");
        }
    }
}
