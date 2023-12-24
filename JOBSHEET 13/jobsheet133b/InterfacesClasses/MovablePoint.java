/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.InterfacesClasses;

/**
 * The subclass MovablePoint needs to implement all the abstract methods
 *   defined in the interface Movable
 * Created by 22343017_Abdul Hafiz
 */
public class MovablePoint implements Movable {
   // Private member variables
   private int x, y;   // x and y coordinates of the point
      
   /** Constructs a MovablePoint instance at the given x and y */
   public MovablePoint(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /** Returns a self-descriptive string */ 
   @Override
   public String toString() {
      return "(" + x + "," + y + ")";
   }

   // Need to implement all the abstract methods defined in the interface Movable
   @Override
   public void moveUp() {
      y--;
   }
   @Override
   public void moveDown() {
      y++;
   }
   @Override
   public void moveLeft() {
      x--;
   }
   @Override
   public void moveRight() {
      x++;
   }
}
