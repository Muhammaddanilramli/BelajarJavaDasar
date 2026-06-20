/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan12;

/**
 *
 * @author LENOVO
 */
public class DemoPolimorfirsme {
    public static void main(String[]args){
        Hewan h1 = new Hewan();
        h1.bersuara();
        Hewan h2 = new Kucing();
        h2.bersuara();
        Hewan h3 = new Anjing();
        h3.bersuara();
    }
}
