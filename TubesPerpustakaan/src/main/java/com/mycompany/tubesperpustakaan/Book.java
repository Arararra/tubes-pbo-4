/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesperpustakaan;

/**
 *
 * @author LENOVO
 */
public class Book {
    private int id;
    protected String title;
    private int categoryId;
    private int stock;
    private String author;
    private String publisher;

    public Book(int id, String title, int categoryId, int stock, String author, String publisher) {
        this.id = id;
        this.title = title;
        this.categoryId = categoryId;
        this.stock = stock;
        this.author = author;
        this.publisher = publisher;
    }

    public void displayInfo() {
        System.out.println("Buku ID: " + id);
        System.out.println("Judul: " + title);
        System.out.println("Kategori ID: " + categoryId);
        System.out.println("Stok: " + stock);
        System.out.println("Penulis: " + author);
        System.out.println("Penerbit: " + publisher);
    }
}
