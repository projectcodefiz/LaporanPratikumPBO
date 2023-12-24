/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.josbheet13exercise.Exercise5_TestMain4;

/**
 *
 * Created By_22343017_Abdul Hafiz
 */

public class Account {
    // Private instance variables
    private String id;
    private String name;
    private int balance;

    // Constructors
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this(id, name, 0);  // default balance is 0
    }

    // Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Other methods
    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Transfer amount exceeded account balance.");
        }
    }

    // toString() method
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}