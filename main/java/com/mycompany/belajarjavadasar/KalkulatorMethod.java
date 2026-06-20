/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */import java.util.Scanner;

public class KalkulatorMethod {
    static double tambah(double a, double b){
        return a + b;
    }
    
    static double kurang(double a, double b){
        return a - b;
    }
    
    static double kali(double a, double b){
        return a * b;
    }
    
    static double bagi(double a, double b){
        return a / b;
    }
    
    static void tampilMenu(){
        System.out.println("=== KALKULATOR METHOD ===");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali (*)");
        System.out.println("4. Bagi (/)");
        System.out.println("5. Keluar");
        System.out.println("Pilih :");
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pilihan;
        double angka1, angka2, hasil = 0;
        
        do {
            tampilMenu();
            pilihan = scan.nextInt();
            
            if (pilihan >= 1 && pilihan <= 4){
                System.out.print("Masukkan Angka 1 :");
                angka1 = scan.nextDouble();
                System.out.print("Masukkan Angka 2 :");
                angka2 = scan.nextDouble();
                
                if (pilihan == 1) hasil = tambah(angka1, angka2);
                else if (pilihan == 2) hasil = kurang(angka1, angka2);
                else if (pilihan == 3) hasil = kali(angka1, angka2);
                else if (pilihan == 4) hasil = bagi(angka1, angka2);
                
                System.out.println("Hasil: " + hasil);
                
            } else if (pilihan == 5){
               System.out.println("Terimakasi......"); 
            } else {
                 System.out.println("Pilihan Salah"); 
            }
        } while (pilihan != 5);
        
        scan.close();
    }
}
