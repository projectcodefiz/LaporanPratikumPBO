/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet133b.InterfacesClasses;

/**
 * The Movable interface defines a list of public abstract methods
 *   to be implemented by its subclasses
 * Created by 22343017_Abdul Hafiz
 */
public interface Movable {  // use keyword "interface" (instead of "class") to define an interface
   // An interface defines a list of public abstract methods to be implemented by the subclasses
   public void moveUp();    // "public" and "abstract" optional
   public void moveDown();
   public void moveLeft();
   public void moveRight();
}