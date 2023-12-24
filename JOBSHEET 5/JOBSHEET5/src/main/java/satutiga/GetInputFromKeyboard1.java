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
public class GetInputFromKeyboard1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hoby = "";
        
        try{
            System.out.println("Nama Anda :");
            name = dataIn.readLine();
            System.out.println("Hobi Anda : ");
            hoby = dataIn.readLine();  
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
        
        System.out.println("Jadi Hobi Anda " + hoby + ". Hobi yang bagus " + name);              
    }
}
