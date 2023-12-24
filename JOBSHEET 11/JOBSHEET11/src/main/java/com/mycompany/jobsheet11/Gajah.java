/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet11;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

public class Gajah {
    //meng-overwrite method pada Class Hewan
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan");
    }
    
    //meng-overwrite method pada class Hewan
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");
    }
    
    public static void main(String args[]){
        Gajah myGajah = new Gajah();
        Gajah myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
