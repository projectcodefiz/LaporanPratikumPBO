/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.satusatu.jobsheet6;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

public class HitungRataRataB {
    public static void main(String[] args) {
        // Menggunakan JOptionPane untuk mendapatkan input dari user
        double nilai1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai ujian pertama:"));
        double nilai2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai ujian kedua:"));
        double nilai3 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:"));

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

        // Menampilkan output menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, pesan);
    }
}

