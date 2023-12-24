/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.AbstractClassesnInterfaces;

/**
 * The abstract superclass Monster defines the expected common behaviors,
 *   via abstract methods.
 * Created by 22343017_Abdul Hafiz
 */
abstract public class Monster {
   private String name;  // private instance variable

   /** Constructs a Monster instance of the given name */
   public Monster(String name) {
      this.name = name;
   }

   /** Define common behavior for all its subclasses */
   abstract public String attack();
}
