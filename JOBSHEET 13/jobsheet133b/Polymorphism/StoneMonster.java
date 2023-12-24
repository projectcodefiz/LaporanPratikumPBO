/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.Polymorphism;
/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

import com.mycompany.jobsheet133b.Polymorphism.Monster;

public class StoneMonster extends Monster {
   /** Constructs a StoneMonster instance with the given name */
   public StoneMonster(String name) {
      super(name);
   }
   /** Subclass provides actual implementation for attack() */
   @Override
   public String attack() {
      return "Attack with stones!";
   }
}
