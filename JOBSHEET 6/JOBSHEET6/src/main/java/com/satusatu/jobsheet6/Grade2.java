/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.satusatu.jobsheet6;

/**
 *
 * @author User
 */
public class Grade2 {
    public static void main(String []args){
        int grade = 92;
        
        switch(grade){
            case 100:
                System.out.println("Excellent!");
            case 90:
                System.out.println("Good Job!");
            case 80:
                System.out.println("Study Harder!");
            default:
                System.out.println("Sorry, you failed.");
        }
    }
}
