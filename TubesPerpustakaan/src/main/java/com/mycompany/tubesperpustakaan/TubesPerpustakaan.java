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
        // Membuat kategori buku
        Category kategori1 = new Category(1, "Pemrograman");
        Category kategori2 = new Category(2, "Novel");

        // Membuat user
        User user1 = new User(1, "Budi", "budi@example.com", "08123456789", "Jl. Merdeka No. 1", "admin");

        // Membuat buku dengan kategori
        Book book1 = new Book(101, "Pemrograman Java", kategori1, 5, "Eko", "Gramedia");
        Book book2 = new Book(102, "Laskar Pelangi", kategori2, 10, "Andrea Hirata", "Bentang Pustaka");

        // Membuat transaksi
        Transaction transaction1 = new Transaction(1, user1, book1, "2025-03-24", "2025-04-01", "dipinjam");

        // Membuat denda
        Fine fine1 = new Fine(1, transaction1, 5000);

        // Menampilkan informasi
        System.out.println("=== INFO KATEGORI ===");
        kategori1.displayCategory();
        kategori2.displayCategory();

        System.out.println("\n=== INFO USER ===");
        user1.displayInfo();

        System.out.println("\n=== INFO BUKU ===");
        book1.displayInfo();
        book2.displayInfo();

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
