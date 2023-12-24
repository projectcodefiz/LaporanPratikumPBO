/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satutiga;

/**
 *
 * @author Created by 22343017_Abdul Hafiz
 */
import javax.swing.JOptionPane;

public class JOptionPaneTugas {
    public static void main(String[] args) {
        // Menggunakan JOptionPane untuk mengambil input dari pengguna
        String kata1 = JOptionPane.showInputDialog("Masukkan Kata ke-1:");
        String kata2 = JOptionPane.showInputDialog("Masukkan Kata ke-2");
        String kata3 = JOptionPane.showInputDialog("Masukkan Kata ke-3:");

        // Menggabungkan kata-kata yang dimasukkan pengguna
        String output = kata1 + " " + kata2 + " " + kata3;

        // Menampilkan output dalam dialog
        JOptionPane.showMessageDialog(null, output);

        // Keluar dari program
        System.exit(0);
    }
}

