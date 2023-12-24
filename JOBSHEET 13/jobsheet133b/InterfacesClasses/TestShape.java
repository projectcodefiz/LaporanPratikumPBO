/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.InterfacesClasses;
/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

public class TestShape {
   public static void main(String[] args) {
      Shape s1 = new Rectangle(1, 2);  // upcast
      System.out.println(s1);
      //Rectangle[length=1,width=2]
      System.out.println("Area is " + s1.getArea());
      //Area is 2.0

      Shape s2 = new Triangle(3, 4);  // upcast
      System.out.println(s2);
      //Triangle[base=3,height=4]
      System.out.println("Area is " + s2.getArea());
      //Area is 6.0

      // Cannot create instance of an interface
      //Shape s3 = new Shape("green");
      //compilation error: Shape is abstract; cannot be instantiated
   }
}