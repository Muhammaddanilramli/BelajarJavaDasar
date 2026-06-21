/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan11;

/**
 *
 * @author STT MANDALA
 */
public class RunPegawai {
    public static void main(String[] args){
        Pegawai pgw = new Pegawai("Rangga",3500000);
        System.out.println("==== Pegawai Biasa ====");
        pgw.tampilInfo();
        
        System.out.println("\n");
        
        Manajer mnr = new Manajer("Siti", 50000000, 4000000);
        System.out.println("====Pegawai Manajer====");
        mnr.tampilInfo();
    }
}
