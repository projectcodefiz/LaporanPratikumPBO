/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.satusatu.jobsheet8;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */

import javax.swing.JOptionPane;

public class Array10Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i+1));
            numbers[i] = Integer.parseInt(input);
        }
        int largest = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Nomor terbesar adalah " + largest);
    }
}
