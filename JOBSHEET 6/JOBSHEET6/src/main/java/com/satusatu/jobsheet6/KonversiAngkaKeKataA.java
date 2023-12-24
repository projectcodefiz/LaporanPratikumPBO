/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.satusatu.jobsheet6;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class KonversiAngkaKeKataA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka antara 1-10: ");
        int angka = scanner.nextInt();

        // Menggunakan statement if-else-if untuk konversi
        String kata = "";
        if (angka == 1) {
            kata = "Satu";
        } else if (angka == 2) {
            kata = "Dua";
        } else if (angka == 3) {
            kata = "Tiga";
        } else if (angka == 4) {
            kata = "Empat";
        } else if (angka == 5) {
            kata = "Lima";
        } else if (angka == 6) {
            kata = "Enam";
        } else if (angka == 7) {
            kata = "Tujuh";
        } else if (angka == 8) {
            kata = "Delapan";
        } else if (angka == 9) {
            kata = "Sembilan";
        } else if (angka == 10) {
            kata = "Sepuluh";
        } else {
            kata = "Invalid number";
        }

        // Menampilkan output
        System.out.println(kata);

        scanner.close();
    }
}

