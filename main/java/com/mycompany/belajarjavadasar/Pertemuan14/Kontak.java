/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan14;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Kontak {
    private String nama;
    private String nomorTelepon;
    
    public Kontak(String nama, String nomortelepon){
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        }
        public String getNama(){
            return nama;
        }
        
        public void tampilkanKontak(){
            System.out.println("Nama: " + nama + " | No. Telp: " + nomorTelepon);
        }
    
}
