/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class RunProduk {
    public static void main(String[] args){
        Produk barang1 = new Produk("Laptop Gaming", 15000000,10);
        System.out.println("---Data Produk Awwal ---");
        System.out.println("Nama Produk: " + barang1.getNamaProduk());
        System.out.println("Harga: Rp " + barang1.getHarga());
        System.out.println("Stok: " + barang1.getStok());
        System.out.println("\n--- Menambah Stok ---");
        barang1.tambahStok(5);
        System.out.println("\n--- Mengurangi Stok ---");
        barang1.kurangiStok(3);
        System.out.println("\n--- Uji Validasi: Kurangi berlebih ---");
        barang1.kurangiStok(20);
        System.out.println("\n--- Uji validasi: Set Stok negatif ---");
        barang1.setStok(-5);
        System.out.println("\n Akhir: " + barang1.getStok());
    }
}
