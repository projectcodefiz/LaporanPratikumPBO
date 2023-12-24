/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.InterfacesClasses;

/**
 * The subclass Rectangle needs to implement all the abstract methods in Shape
 * Created by 22343017_Abdul Hafiz
 */

public class Rectangle implements Shape {  // using keyword "implements" instead of "extends"
   // Private member variables
   private int length, width;

   /** Constructs a Rectangle instance with the given length and width */
   public Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
   }

   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }

   // Need to implement all the abstract methods defined in the interface
   /** Returns the area of this rectangle */
   @Override
   public double getArea() {
      return length * width;
   }
}