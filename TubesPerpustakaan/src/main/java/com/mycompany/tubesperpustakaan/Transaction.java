/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesperpustakaan;

/**
 *
 * @author LENOVO
 */
public class Transaction {
    protected int id;
    private User user;
    private Book book;
    private String borrowDate;
    private String returnDate;
    private String status;

    public Transaction(int id, User user, Book book, String borrowDate, String returnDate, String status) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public void borrowBook() {
        System.out.println(user.name + " meminjam buku: " + book.title);
        this.status = "dipinjam";
    }

    public void returnBook() {
        System.out.println(user.name + " mengembalikan buku: " + book.title);
        this.status = "dikembalikan";
    }

    public void displayTransaction() {
        System.out.println("Transaksi ID: " + id);
        System.out.println("User: " + user.name);
        System.out.println("Buku: " + book.title);
        System.out.println("Tanggal Pinjam: " + borrowDate);
        System.out.println("Tanggal Kembali: " + returnDate);
        System.out.println("Status: " + status);
    }
}
