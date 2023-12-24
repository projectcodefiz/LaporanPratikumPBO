/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.satusatu.jobsheet6;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitungRataRataA {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Meminta tiga nilai ujian dari pengguna
        System.out.println("Masukkan tiga nilai ujian:");
        double nilai1 = Double.parseDouble(reader.readLine());
        double nilai2 = Double.parseDouble(reader.readLine());
        double nilai3 = Double.parseDouble(reader.readLine());

        // Menghitung rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Menyiapkan pesan yang akan ditampilkan
        String pesan = "Rata-rata nilai ujian: " + rataRata;

        // Menampilkan smiley face atau sad face berdasarkan nilai rata-rata
        if (rataRata >= 60) {
            pesan += "\n:-)";
        } else {
            pesan += "\n:-(";
        }

        // Menampilkan output
        System.out.println(pesan);

        reader.close();
    }
}

