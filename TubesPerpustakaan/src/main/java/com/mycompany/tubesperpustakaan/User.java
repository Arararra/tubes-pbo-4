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
    protected String role;

    public User(int id, String name, String email, String phone, String address, String role) {
        super(id, name, email, phone);
        this.address = address;
        this.role = role;
    }

    @Override
    public void displayInfo() {
        System.out.println("User ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Email: " + email);
        System.out.println("Telepon: " + phone);
        System.out.println("Alamat: " + address);
        System.out.println("Role: " + role);
    }
}

class Member extends User {
    public Member(int id, String name, String email, String phone, String address) {
        super(id, name, email, phone, address, "member");
    }

    @Override
    public void displayInfo() {
        System.out.println("==== Member Info ====");
        super.displayInfo();
    }
}

// Class Admin
class Admin extends User {
    public Admin(int id, String name, String email, String phone, String address) {
        super(id, name, email, phone, address, "admin");
    }

    @Override
    public void displayInfo() {
        System.out.println("==== Admin Info ====");
        super.displayInfo();
    }
}