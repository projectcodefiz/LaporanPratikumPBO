/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satutiga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */
public class BufferedReader1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");
        
        try{
            System.out.print("Masukkan angka pertama : ");
            a = dataIn.readLine();
            /*Data yang akan diproses aritmatika harus dikonversikan dahulu
            dari tipe data String ke tipe data angka yang diperlukan
            Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu String*/
            angka1 = Float.parseFloat(a); //konversikan dari String ke float
            
            System.out.print("Masukkan angka kedua :");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b); //konversikan dari String ke Float
            
            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
    }
}
