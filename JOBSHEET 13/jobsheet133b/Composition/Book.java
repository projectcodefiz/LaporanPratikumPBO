package com.mycompany.jobsheet133b.Composition;

import com.mycompany.jobsheet133b.Composition.Author;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The Book class models a book with one (and only one) author.
 * Created by 22343017_Abdul Hafiz
 */

public class Book {
   // The private instance variables
   private String name;
   private Author author;
   private double price;
   private int qty;
 
   /** Constructs a Book instance with the given author */
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   // Getters and Setters
   /** Returns the name of this book */
   public String getName() {
      return name;
   }
   /** Return the Author instance of this book */
   public Author getAuthor() {
      return author;  // return member author, which is an instance of the class Author
   }
   /** Returns the price */
   public double getPrice() {
      return price;
   }
   /** Sets the price */
   public void setPrice(double price) {
      this.price = price;
   }
   /** Returns the quantity */
   public int getQty() {
      return qty;
   }
   /** Sets the quantity */
   public void setQty(int qty) {
      this.qty = qty;
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return "'" + name + "' by " + author;  // author.toString()
   }
}
