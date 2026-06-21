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

public class KasirSederhana {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int total = 0;
        char lagi;
        do{
            System.out.print("Masukkan harga barang: ");
            int harga = scan.nextInt();
            total = total + harga;
            
            System.out.print("Anda barang lagi (y/n): ");
            lagi = scan.next().charAt(0);
            
        } while (lagi == 'y' || lagi == 'y');
        
        System.out.println("----------------------------");
        System.out.println("Total Harga: " + total);
        scan.close();
    }
    
}
