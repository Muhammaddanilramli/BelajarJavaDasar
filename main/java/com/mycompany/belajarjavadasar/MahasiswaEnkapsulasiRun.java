/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class MahasiswaEnkapsulasiRun {
    public static void main(String[] args){
       MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi("Andi", 20);
       
       System.out.println("Nama Awal: " + mhs.getNama());
       
       System.out.println("\nMengubah nama menjasi Budi...");
       mhs.setNama("Budi");
       
       System.out.println("mengubah set umur = -5...");
       mhs.setUmur(-5);
       
       System.out.println("Mencoba set umur = 21...");
       mhs.setUmur(21);
       
       mhs.tampilInfo();
    }
}
