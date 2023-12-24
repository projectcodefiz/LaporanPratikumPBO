/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.Polymorphism;

import com.mycompany.jobsheet133b.Polymorphism.Monster;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

public class WaterMonster extends Monster {
   /** Constructs a WaterMonster instance with the given name */
   public WaterMonster(String name) {
      super(name);
   }
   /** Subclass provides actual implementation for attack() */
   @Override
   public String attack() {
      return "Attack with water!";
   }
}