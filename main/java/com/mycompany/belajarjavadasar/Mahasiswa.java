/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    public String nama;
    public String nim;
    public double ipk;
    
    public Mahasiswa(String nama, String nim, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public void tampilInfo() {
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("IPK : " + ipk);
        System.out.println("-----------------------");
    }
    
    public void belajar(){
        System.out.println(nama + "sedang belajar java OOP.");
    }
}


