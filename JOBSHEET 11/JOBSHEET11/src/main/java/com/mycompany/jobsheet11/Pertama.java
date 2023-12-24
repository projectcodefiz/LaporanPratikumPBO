/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jobsheet11;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

public class Pertama {
    private int a = 10;
    
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
