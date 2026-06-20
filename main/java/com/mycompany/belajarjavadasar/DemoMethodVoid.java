/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class DemoMethodVoid {
    
    static void garis() {
        System.out.println("===============================");
    }
    
    static void sapaTeman(String nama) {
        System.out.println("Hallo, " + nama + "! Selamat datang di java. ");
    }
    
    public static void main(String[] args) {
        garis();
        sapaTeman("Budi");
        sapaTeman("Siti");
        garis();
    }
}
