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
    private Category category;
    private int stock;
    private String author;
    private String publisher;

    public Book(int id, String title, Category category, int stock, String author, String publisher) {
      this.id = id;
      this.title = title;
      this.category = category;
      this.stock = stock;
      this.author = author;
      this.publisher = publisher;
    }

    public void displayInfo() {
      System.out.println("Buku ID: " + id);
      System.out.println("Judul: " + title);
      System.out.println("Kategori: " + category.getName());
      System.out.println("Stok: " + stock);
      System.out.println("Penulis: " + author);
      System.out.println("Penerbit: " + publisher);
    }
}
