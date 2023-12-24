/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.Polymorphism;
/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

import com.mycompany.jobsheet133b.Polymorphism.StoneMonster;
import com.mycompany.jobsheet133b.Polymorphism.WaterMonster;
import com.mycompany.jobsheet133b.Polymorphism.FireMonster;
import com.mycompany.jobsheet133b.Polymorphism.Monster;

public class TestMonster {
   public static void main(String[] args) {
      // Program at the specification defined in the superclass/interface.
      // Declare instances of the superclass, substituted by subclasses.
      Monster m1 = new FireMonster("r2u2");   // upcast
      Monster m2 = new WaterMonster("u2r2");  // upcast
      Monster m3 = new StoneMonster("r2r2");  // upcast

      // Invoke the actual implementation
      System.out.println(m1.attack());  // Run FireMonster's attack()
      //Attack with fire!
      System.out.println(m2.attack());  // Run WaterMonster's attack()
      //Attack with water!
      System.out.println(m3.attack());  // Run StoneMonster's attack()
      //Attack with stones!

      // m1 dies, generate a new instance and re-assign to m1.
      m1 = new StoneMonster("a2b2");  // upcast
      System.out.println(m1.attack());  // Run StoneMonster's attack()
      //Attack with stones!

      // We have a problem here!!!
      Monster m4 = new Monster("u2u2");
      System.out.println(m4.attack());  // garbage!!!
      //!^_&^$@+%$* I don't know how to attack!
   }
}