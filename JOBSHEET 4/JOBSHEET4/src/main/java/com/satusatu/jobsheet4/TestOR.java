/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.satusatu.jobsheet4;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */
public class TestOR {
    public static void main(String[] args){
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //demontrasi ||
        test = (i < 10) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demontrasi |
        test = (i < 10) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
