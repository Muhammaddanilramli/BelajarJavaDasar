/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan12;

/**
 *
 * @author LENOVO
 */
public class KebunBinatang {
    public static void main(String[]args){
        Hewan[] kumpulanHewan = new Hewan[3];
       
        kumpulanHewan[0] = new Hewan();
        kumpulanHewan[1] = new Kucing();
        kumpulanHewan[2] = new Anjing();
        
        System.out.println("=== Simfoni Kebun binatang ===");
        for (Hewan h : kumpulanHewan){
            h.bersuara();
        }
    }
}
