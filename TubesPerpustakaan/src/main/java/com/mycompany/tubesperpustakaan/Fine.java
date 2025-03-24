/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesperpustakaan;

/**
 *
 * @author LENOVO
 */
public class Fine {
    private final int id;
    private final Transaction transaction;
    private final double amount;
    private boolean isPaid;

    public Fine(int id, Transaction transaction, double amount) {
        this.id = id;
        this.transaction = transaction;
        this.amount = amount;
        this.isPaid = false;
    }

    public void payFine() {
        System.out.println("Denda untuk transaksi ID " + transaction.id + " telah dibayar.");
        this.isPaid = true;
    }

    public void displayFine() {
        System.out.println("Denda ID: " + id);
        System.out.println("Transaksi ID: " + transaction.id);
        System.out.println("Jumlah Denda: Rp" + amount);
        System.out.println("Status: " + (isPaid ? "Lunas" : "Belum Dibayar"));
    }
}
