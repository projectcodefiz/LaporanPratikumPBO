package com.mycompany.jobsheet133b.Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The Point2D class models a 2D point at (x, y).
 * Created by 22343017_Abdul Hafiz
 */
public class Point2D {
   // Private instance variables
   private int x, y;

   // Constructors
   /** Construct a Point2D instance at (0,0) */
   public Point2D() {  // default constructor
      this.x = 0;
      this.y = 0;
   }
   /** Constructs a Point2D instance at the given (x,y) */
   public Point2D(int x, int y) {
      this.x = x;
      this.y = y;
   }

   // Getters and Setters
   public int getX() {
      return this.x;
   }
   public void setX(int x) {
      this.x = x;
   }
   public int getY() {
      return this.y;
   }
   public void setY(int y) {
      this.y = y;
   }

   /** Returns a self-descriptive string in the form of "(x,y)" */
   @Override
   public String toString() {
      return "(" + this.x + "," + this.y + ")";
   }
}
