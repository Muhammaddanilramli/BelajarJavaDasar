/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan11;

/**
 *
 * @author STT MANDALA
 */
public class Manajer extends Pegawai {
    private double tunjangan;
    
    public Manajer(String nama, double gajiPokok, double tunjangan){
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
        
    }
    
    public void tampilInfoManajer(){
        super.tampilInfo();
        System.out.println("Tunjangan = Rp" + tunjangan);
        System.out.println("Total     = Rp" + (gajiPokok + tunjangan));
    }
}
