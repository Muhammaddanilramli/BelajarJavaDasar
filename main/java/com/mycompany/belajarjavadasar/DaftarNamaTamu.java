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

public class DaftarNamaTamu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Tamu: ");
            int jumlahTamu = input.nextInt();
            input.nextLine();
            
            String[] daftarTamu = new String[jumlahTamu];
            
            for (int i = 0; i < jumlahTamu; i++){
                
            System.out.print(" Masukkan nama Tamu Ke-" + (i + 1) + " :");
                daftarTamu[i] = input.nextLine();
            }
            
            System.out.println("\n--- Daftar Nama Tamu ---");
            int countA = 0;
            
            for (int i = 0; i < daftarTamu.length; i++){
                System.out.println("Tamu" + (i + 1) + " : " + daftarTamu[i]);
                
                if (daftarTamu[i].startsWith("A")){
                    countA++;
                }
            }
            
            System.out.println("\nJumlah tamu yang diawali huruf 'A': " + countA);
            
            input.close();
    }
    
}
