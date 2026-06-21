/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int jumlahMahasiswa = 2;
        int jumlahMatkul = 3;
        
        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];
        
        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.println("\n---- Input Data Mahasiswa Ke-" + (i + 1) + " ----");
            for (int j = 0; j < jumlahMatkul; j++){
                System.out.print("Masukan nilai Matkul Ke-" + (j + 1) + " ;");
                nilai[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("\n==============================");
        System.out.println("     LAPORAN NILAI MAHASISWA    ");
        System.out.println("\n==============================");
        
        for (int i =0; i < jumlahMahasiswa; i++){
            int total = 0;
            System.out.print("Mahasiswa" + (i + 1) + " : ");
            
            for (int j =0; j < jumlahMatkul; j++){
                System.out.print(nilai[i][j]+ " | ");
                total += nilai[i][j];
        }
            
            double rata = (double) total / jumlahMatkul;
            System.out.println("Rata-rata: " + rata);
            
        } 
        
        scan.close();
            
    }
}
