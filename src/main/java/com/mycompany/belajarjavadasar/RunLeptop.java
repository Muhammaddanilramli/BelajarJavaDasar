/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class RunLeptop {
    public static void main(String[] args) {
        
        Leptop laptop1 = new Leptop("ASUS ROG", 15000000, "Hitam");
        Leptop laptop2 = new Leptop("MacBook M3", 20000000, "Silver");

        System.out.println("--- Spesifikasi Laptop 1 ---");
        laptop1.tampilSpek();
        
        System.out.println("\n--- Spesifikasi Laptop 2 ---");
        laptop2.tampilSpek();

        int hargaDiskon = laptop1.diskon(10);
        System.out.println("\nPromo Laptop 1 (Diskon 10%):");
        System.out.println("Harga Akhir: Rp" + hargaDiskon);
    }
}
