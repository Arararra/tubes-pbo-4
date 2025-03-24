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

        // Membuat user tanpa inheritance
        User user1 = new User(1, "Budi", "budi@example.com", "08123456789", "Jl. Merdeka No. 1", "user");

        // Membuat user dengan inheritance
        Member member1 = new Member(2, "Andi", "andi@example.com", "08234567890", "Jl. Pahlawan No. 2");
        Admin admin1 = new Admin(3, "Siti", "siti@example.com", "08345678901", "Jl. Sudirman No. 3");

        // Membuat buku dengan kategori
        Book book1 = new Book(101, "Pemrograman Java", kategori1, 5, "Eko", "Gramedia");
        Book book2 = new Book(102, "Laskar Pelangi", kategori2, 10, "Andrea Hirata", "Bentang Pustaka");

        // Membuat transaksi
        Transaction transaction1 = new Transaction(1, member1, book1, "2025-03-24", "2025-04-01", "dipinjam");

        // Membuat denda
        Fine fine1 = new Fine(1, transaction1, 5000);

        // Menampilkan informasi kategori
        System.out.println("=== INFO KATEGORI ===");
        kategori1.displayCategory();
        kategori2.displayCategory();

        // Menampilkan informasi user tanpa inheritance
        System.out.println("\n=== INFO USER BIASA ===");
        user1.displayInfo();

        // Menampilkan informasi user dengan inheritance (Member & Admin)
        System.out.println("\n=== INFO MEMBER ===");
        member1.displayInfo();

        System.out.println("\n=== INFO ADMIN ===");
        admin1.displayInfo();

        // Menampilkan informasi buku
        System.out.println("\n=== INFO BUKU ===");
        book1.displayInfo();
        book2.displayInfo();

        // Menampilkan informasi transaksi
        System.out.println("\n=== INFO TRANSAKSI ===");
        transaction1.displayTransaction();

        // Menampilkan informasi denda
        System.out.println("\n=== INFO DENDA ===");
        fine1.displayFine();

        // Simulasi bayar denda
        System.out.println("\n=== BAYAR DENDA ===");
        fine1.payFine();
        fine1.displayFine();
    }
}
