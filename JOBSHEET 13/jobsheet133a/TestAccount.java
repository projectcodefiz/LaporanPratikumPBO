/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133a;

/**
 * A Test Driver for the Account class.
 * Created by 22343017_Abdul Hafiz
 */

public class TestAccount {
   public static void main(String[] args) {
      // Test Constructors and toString()
      Account a1 = new Account(5566);
      System.out.println(a1);
      //Account[number=5566,balance=$0.00]
      Account a2 = new Account(1234, 99.9);
      System.out.println(a2);
      //Account[number=1234,balance=$99.90]

      // Test getters
      System.out.println("The account Number is: " + a2.getNumber());
      //The account Number is: 1234
      System.out.println("The balance is: " + a2.getBalance());
      //The balance is: 99.9

      // Test credit(), debit() and transferTo()
      a1.credit(11.1);
      System.out.println(a1);
      //Account[number=5566,balance=$11.10]
      a1.debit(5.5);
      System.out.println(a1);
      //Account[number=5566,balance=$5.60]
      a1.debit(500);   // Test debit() error
      //amount exceeded
      System.out.println(a1);
      //Account[number=5566,balance=$5.60]

      a2.transferTo(1.0, a1);
      System.out.println(a1);
      //Account[number=5566,balance=$6.60]
      System.out.println(a2);
      //Account[number=1234,balance=$98.90]
    }
}