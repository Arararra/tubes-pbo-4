/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesperpustakaan;

/**
 *
 * @author LENOVO
 */
public class User extends Person {
    private String address;

    public User(int id, String name, String email, String phone, String address) {
        super(id, name, email, phone);
        this.address = address;
    }

    @Override
    public void displayInfo() {
        System.out.println("User ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Email: " + email);
        System.out.println("Telepon: " + phone);
        System.out.println("Alamat: " + address);
    }
}
