/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesperpustakaan;

/**
 *
 * @author LENOVO
 */
public abstract class Person {
    protected int id;
    protected String name;
    protected String email;
    protected String phone;

    public Person(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public abstract void displayInfo();
}
