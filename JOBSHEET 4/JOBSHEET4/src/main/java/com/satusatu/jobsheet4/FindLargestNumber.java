/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.satusatu.jobsheet4;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */
public class FindLargestNumber {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;

        // Menentukan nilai terbesar menggunakan operator kondisi
        int largestNumber = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3);

        // Menampilkan output
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Nilai tertingginya adalah angka = " + largestNumber);
    }
}
