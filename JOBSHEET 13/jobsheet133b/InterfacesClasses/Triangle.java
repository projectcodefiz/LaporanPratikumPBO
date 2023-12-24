/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.InterfacesClasses;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

public class Triangle implements Shape {
   // Private member variables
   private int base, height;

   /** Constructs a Triangle instance with the given base and height */
   public Triangle(int base, int height) {
      this.base = base;
      this.height = height;
   }

   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "Triangle[base=" + base + ",height=" + height + "]";
   }

   // Need to implement all the abstract methods defined in the interface
   /** Returns the area of this triangle */
   @Override
   public double getArea() {
      return 0.5 * base * height;
   }
}