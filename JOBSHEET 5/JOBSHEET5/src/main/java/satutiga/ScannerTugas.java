/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satutiga;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */
import java.util.Scanner;

public class ScannerTugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kata ke-1: ");
        String kata1 = scanner.next();

        System.out.print("Masukkan Kata ke-2: ");
        String kata2 = scanner.next();

        System.out.print("Masukkan Kata ke-3: ");
        String kata3 = scanner.next();

        System.out.println(kata1 + " " + kata2 + " " + kata3);

        scanner.close();
    }
}

