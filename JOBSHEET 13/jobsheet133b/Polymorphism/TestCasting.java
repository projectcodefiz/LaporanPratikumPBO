/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.Polymorphism;
/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

public class TestCasting {
   public static void main(String[] args) {
      A a1 = new C();   // upcast
      //Constructed an instance of A
      //Constructed an instance of B
      //Constructed an instance of C
      System.out.println(a1);  // run C's toString()
      //This is C
      B b1 = (B)a1;     // downcast okay
      System.out.println(b1);  // run C's toString()
      //This is C
      C c1 = (C)b1;     // downcast okay
      System.out.println(c1);  // run C's toString()
      //This is C

      A a2 = new B();  // upcast
      //Constructed an instance of A
      //Constructed an instance of B
      System.out.println(a2);  // run B's toString()
      //This is B
      B b2 = (B)a2;    // downcast okay
      // The following line is commented out to avoid the ClassCastException
      // C c2 = (C)a2;  // compilation error: incompatible types
   }
}
