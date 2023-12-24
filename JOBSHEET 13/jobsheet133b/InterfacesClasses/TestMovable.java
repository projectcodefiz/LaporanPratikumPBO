/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.InterfacesClasses;
/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

public class TestMovable {
   public static void main(String[] args) {
      MovablePoint p1 = new MovablePoint(1, 2);
      System.out.println(p1);
      //(1,2)
      p1.moveDown();
      System.out.println(p1);
      //(1,3)
      p1.moveRight();
      System.out.println(p1);
      //(2,3)

      // Test Polymorphism
      Movable p2 = new MovablePoint(3, 4);  // upcast
      p2.moveUp();
      System.out.println(p2);
      //(3,3)

      MovablePoint p3 = (MovablePoint)p2;   // downcast
      System.out.println(p3);
      //(3,3)
   }
}