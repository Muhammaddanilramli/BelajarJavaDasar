/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class Leptop {
    public String merk;
    public int harga;
    public String warna;

    public Leptop(String merk, int harga, String warna) {
        this.merk = merk;
        this.harga = harga;
        this.warna = warna;
    }

    // 3. Method tampilSpek
    public void tampilSpek() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Harga : Rp" + harga);
    }

    // 4. Method diskon (Return int)
    public int diskon(int persen) {
        int potongan = harga * persen / 100;
        return harga - potongan;
    }

}
