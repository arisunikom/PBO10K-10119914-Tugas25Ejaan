/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas25;

import java.util.Scanner;

/**
 *
 * @author 
 * Aris Prabowo
 * 10119914 - IF10k
 */
public class Main {
    public static void main(String[] args) {
        var Keyboard = new Scanner(System.in);
        String Nama;
        System.out.println("Masukan nama depan anda untuk dieja: ");
        Nama = Keyboard.next();
        System.out.println("Ejaan untuk nama "+Nama+" adalah :");
        int index = 1;
        for (var Huruf : Nama.toCharArray()) 
            System.out.printf("Huruf ke-%d : %c%n",index++,Huruf);
    }
    
}
