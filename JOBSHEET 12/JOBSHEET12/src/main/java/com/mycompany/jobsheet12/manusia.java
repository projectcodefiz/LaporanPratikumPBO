/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet12;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */


abstract class Orang {
    private String namaAyah = "Randi Proska";

    abstract void makan();

    public void minum() {
        System.out.println("Minum Air Teh dan Kopi");
    }

    public String getNamaAyah() {
        return namaAyah;
    }
}

class AnakUmur1Tahun extends Orang {
    public void namaAyahku() {
        System.out.println("Nama Ayahku adalah " + getNamaAyah());
    }

    @Override
    public void makan() {
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum() {
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }
}

public class manusia {
    public static void main(String args[]) {
        // object induk tidak bisa dibuat disini

        // buat object anak umur 1 tahun baru
        AnakUmur1Tahun a1 = new AnakUmur1Tahun();

        // panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahku();
        System.out.println();
    }
}
