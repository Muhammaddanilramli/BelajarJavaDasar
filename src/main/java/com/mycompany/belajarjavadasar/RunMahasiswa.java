/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class RunMahasiswa {
    public static void main(String[] args){
       Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "2024001", 3.5); 
       Mahasiswa mhs2 = new Mahasiswa("Siti Aminan", "2024002", 3.8); 
    
    
        mhs1.tampilInfo();
        mhs2.tampilInfo();

        System.out.println("IPK " + mhs1.nama + " adalah " + mhs1.ipk);

        mhs1.belajar();
        mhs2.belajar();

    }
}
