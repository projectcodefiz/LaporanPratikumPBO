/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.AbstractClassesnInterfaces;

/**
 * This abstract superclass Shape contains an abstract method
 *   getArea(), to be implemented by its subclasses.
 * Created by 22343017_Abdul Hafiz
 */
abstract public class Shape {
   // Private member variable
   private String color;
   
   /** Constructs a Shape instance with the given color */
   public Shape (String color) {
      this.color = color;
   }

   /** Returns a self-descriptive string */   
   @Override
   public String toString() {
      return "Shape[color=" + color + "]";
   }
   
   /** All Shape's concrete subclasses must implement a method called getArea() */
   abstract public double getArea();
}


