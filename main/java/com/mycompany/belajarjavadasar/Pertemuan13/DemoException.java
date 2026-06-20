/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan13;

/**
 *
 * @author LENOVO
 */
public class DemoException {
    public static void main(String[] args){
        int angka1 = 10;
        int angka2 = 0;
        
        System.out.println("Program Dimulai...");
        
       try{
           int hasil = angka1 / angka2;
           System.out.println("Hasil pembagian: " + hasil);
       } catch (ArithmeticException e){
           System.out.println("Error: Tidak bisa membagi dengan angka nol!");
           
       }
       System.out.println("Program selesai.");
    
    }
}
