/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan11;

/**
 *
 * @author STT MANDALA
 */
public class Pegawai {
    
    private String nama;
    double gajiPokok;
    
    public Pegawai(String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    public void tampilInfo(){
        System.out.println(" Nama      :   " + nama);
        System.out.println("Gaji Pokok :Rp " + gajiPokok);
    }
}
