/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan11;

/**
 *
 * @author LENOVO
 */
public class Programmer extends Pegawai {
    private double bonus;
    
    public Programmer(String nama, double gajiPokok, double bonus){
        super(nama, gajiPokok);
        this.bonus = bonus;
    }
    
    
    public void tampilinfo(){
        System.out.println("---Data Programmer ---");
        System.out.println("Nama: " + nama);
        System.out.println("gaji: Rp" + gajiPokok);
        System.out.println("Nama: Rp" + bonus);
    }
}
