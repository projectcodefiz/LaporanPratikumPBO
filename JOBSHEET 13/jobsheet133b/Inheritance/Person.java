/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.Inheritance;

/**
 * The superclass Person has name and address.
 * Created by 22343017_Abdul Hafiz
 */

public class Person {
   // private instance variables
   private String name, address;
   
   /** Constructs a Person instance with the given name and address */
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }
   
   // Getters and Setters
   /** Returns the name */
   public String getName() {
      return name;
   }
   /** Returns the address */
   public String getAddress() {
      return address;
   }
   /** Sets the address */
   public void setAddress(String address) {
      this.address = address;
   }
   
   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return name + "(" + address + ")";
   }
}
