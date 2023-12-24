/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet12;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

class CompileTime {
    // Metode untuk menghitung keliling persegi dengan satu argumen
    static int keliling(int a) {
        return 4 * a;
    }

    // Metode untuk menghitung keliling persegi panjang dengan dua argumen
    static int keliling(int l, int b) {
        return 2 * (l + b);
    }
}

public class polymorphismStatic {
    public static void main(String[] args) {
        // Memanggil metode keliling dengan satu argumen
        System.out.println("Sisi Persegi adalah : 4 \nKeliling Persegi adalah : " + CompileTime.keliling(4) + "\n");

        // Memanggil metode keliling dengan dua argumen
        System.out.println("Sisi Persegi Panjang adalah : 10, 13 \nKeliling Persegi Panjang adalah : " + CompileTime.keliling(10, 13));
    }
}



