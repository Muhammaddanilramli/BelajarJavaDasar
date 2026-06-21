/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan12;

/**
 *
 * @author LENOVO
 */
public class LakukanPolimorfisme {
    public static void main(String[]args){
        Perusahaan h1 = new Perusahaan();
        h1.Pegawai();
        Perusahaan h2 = new Manajer();
        h2.Pegawai();
        Perusahaan h3 = new Programmer();
        h3.Pegawai();
    }
}
    
