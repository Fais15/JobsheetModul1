/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.util.Scanner;

public class Pratikum1 {
    public static void main(String[] args) {
        System.out.print("Program Java Menghitung Luas Permukaan bola\nMasukkan jari-jari bola : ");
        Scanner input = new Scanner(System.in);
        double jari = input.nextDouble();
        System.out.println("Luas Permukaan  bola adalah "+ jari*jari*22/7*4);
    }
}
