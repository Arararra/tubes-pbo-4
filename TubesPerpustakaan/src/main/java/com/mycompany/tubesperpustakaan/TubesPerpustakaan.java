/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tubesperpustakaan;

/**
 *
 * @author LENOVO
 */
public class TubesPerpustakaan {
    public static void main(String[] args) {
        // Membuat user
        User user1 = new User(1, "Budi", "budi@example.com", "08123456789", "Jl. Merdeka No. 1");

        // Membuat buku
        Book book1 = new Book(101, "Pemrograman Java", 1, 5, "Eko", "Gramedia");

        // Membuat transaksi
        Transaction transaction1 = new Transaction(1, user1, book1, "2025-03-24", "2025-04-01", "dipinjam");

        // Membuat denda
        Fine fine1 = new Fine(1, transaction1, 5000);

        // Menampilkan informasi
        System.out.println("=== INFO USER ===");
        user1.displayInfo();

        System.out.println("\n=== INFO BUKU ===");
        book1.displayInfo();

        System.out.println("\n=== INFO TRANSAKSI ===");
        transaction1.displayTransaction();

        System.out.println("\n=== INFO DENDA ===");
        fine1.displayFine();

        // Simulasi bayar denda
        System.out.println("\n=== BAYAR DENDA ===");
        fine1.payFine();
        fine1.displayFine();
    }
}
