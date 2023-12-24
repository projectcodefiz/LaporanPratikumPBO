/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet12;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

interface AktivitasPagi{
    abstract void lari();
    abstract void berenang();
}

class AktivitasPagiAnak implements AktivitasPagi{
    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }
    
    @Override
    public void berenang(){
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}

public class AktivitasUtama {
    public static void main(String args[]){
        AktivitasPagiAnak a1 = new AktivitasPagiAnak();
        
        //panggil method anak umur 1 tahun
        a1.lari();
        a1.berenang();
    }   
}
