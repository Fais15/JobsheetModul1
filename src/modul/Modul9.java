/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.util.Scanner;

public class Modul9 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Nilai TPA:");
        int TPA = masukan.nextInt();
        System.out.print("Masukkan Nilai Bahasa Inggris:");
        int BahasaInggris = masukan.nextInt();
        if((TPA>85)&&(BahasaInggris>80))
            System.out.println("Siswa dapat Beasiswa");
        else
            System.out.println("Siswa Tidak dapat Beasiswa");
    }
}
