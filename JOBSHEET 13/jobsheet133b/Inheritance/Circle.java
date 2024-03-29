/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.Inheritance;

import com.mycompany.jobsheet133b.Inheritance.Circle;

/**
 * The Circle class composes a "Point" instance as its center and a radius.
 * We reuse the "Point" class via composition.
 * Created by 22343017_Abdul Hafiz
 */

public class Circle {
   // private instance variables
   private double radius;
   private String color;

   // Constructors
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
      System.out.println("Construced a Circle with Circle()");  // for debugging
   }
   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
      System.out.println("Construced a Circle with Circle(radius)");  // for debugging
   }
   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
      System.out.println("Construced a Circle with Circle(radius, color)");  // for debugging
   }

   // public getters and setters for the private variables
   public double getRadius() {
      return this.radius;
   }
   public String getColor() {
      return this.color;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public void setColor(String color) {
      this.color = color;
   }

   /** Returns a self-descriptive String */
   public String toString() {
      return "Circle[radius=" + radius + ",color=" + color + "]";
   }

   /** Returns the area of this Circle */
   public double getArea() {
      return radius * radius * Math.PI;
   }
}