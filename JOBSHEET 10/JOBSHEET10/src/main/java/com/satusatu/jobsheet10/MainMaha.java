/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.satusatu.jobsheet10;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

class Maha {
    String nama;
    int NIM;
    int semester;
    double IPS;

    Maha(String nama, int NIM, int semester, double IPS) {
        this.nama = nama;
        this.NIM = NIM;
        this.semester = semester;
        this.IPS = IPS;
    }

    int hitungSKS() {
        if (IPS >= 3.5) {
            return 24;
        } else if (IPS >= 3.0) {
            return 22;
        } else if (IPS >= 2.5) {
            return 20;
        } else if (IPS >= 2.0) {
            return 18;
        } else {
            return 15;
        }
    }

    // Metode untuk mengonversi angka ke angka Romawi
    String angkaRomawi(int angka) {
        String[] romawi = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
        };
        return romawi[angka - 1];
    }

    void infoMahasiswa() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + NIM);
        // Menggunakan metode angkaRomawi untuk menampilkan semester dalam angka Romawi
        System.out.println("Semester: " + angkaRomawi(semester));
        System.out.println("IP Semester ini: " + IPS);
        System.out.println("Anda berhak mengontrak " + hitungSKS() + " SKS pada Semester " + angkaRomawi(semester));
    }
}

public class MainMaha {
    public static void main(String[] args) {
        Maha joni = new Maha("Joni", 12345, 5, 3.50);
        joni.infoMahasiswa();
    }
}



