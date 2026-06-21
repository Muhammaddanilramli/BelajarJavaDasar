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

public class LoopDoWhile {
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pilihan  = 0;
        
        do{
            System.out.println("\n=== MUNU APPLIKASI ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Liat Data");
            System.out.println("3. Keluar");
            System.out.println("pilih:");
            pilihan = scan.nextInt();
            
            switch(pilihan){
                case 1: System.out.println("Data ditambahkan..."); break;
                case 2: System.out.println("Menampikan data..."); break;
                case 3: System.out.println("Terima kasih..."); break;
                default: System.out.println("Pilihan tidak ada!");

            }
        } while (pilihan != 3);
        
        scan.close();
    }
    
}
