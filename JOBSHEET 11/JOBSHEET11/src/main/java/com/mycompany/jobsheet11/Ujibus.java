/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet11;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

public class Ujibus {
    public static void main(String args[]){
        Bus busMini = new Bus();
         busMini.penumpang = 5;
         busMini.maxPenumpang = 15;
        
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang -2 ;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
        
    }
}
