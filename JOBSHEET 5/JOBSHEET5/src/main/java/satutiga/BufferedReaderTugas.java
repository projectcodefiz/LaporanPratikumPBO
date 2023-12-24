/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satutiga;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTugas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Kata ke-1: ");
        String kata1 = reader.readLine();

        System.out.print("Masukkan Kata ke-2: ");
        String kata2 = reader.readLine();

        System.out.print("Masukkan Kata ke-3: ");
        String kata3 = reader.readLine();

        System.out.println(kata1 + " " + kata2 + " " + kata3);

        reader.close();
    }
}


