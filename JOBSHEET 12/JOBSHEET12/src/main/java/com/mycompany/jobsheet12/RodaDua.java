/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet12;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

class RodaDua extends Kendaraan{
    double NaikHargaKe = 0.20;//02 kali
    void hargaAkhir(){
       hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp. " 
                + hargaDasar);
    }
}
