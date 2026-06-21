/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class Produk {
    private String namaProduk;
    private double harga;
    private int stok;
    
    public Produk(String namaProduk, double harga, int stok){
        this.namaProduk = namaProduk;
        this.harga = harga;
        if (stok >= 0) {
            this.stok = stok;
        }else {
            this.stok = 0;
            
            System.out.println("Stok awal tidak valid, di-set 0.");
        }
    }
    
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int stok){
        if (stok >= 0){
            this.stok = stok;
        }else{
            System.out.println("Error: Stok tidak boleh kurang dari 0!");
        }
    }
    
    public void tambahStok(int jumlah){
        if (jumlah > 0){
            this.stok += jumlah;
            System.out.println("Stok berhasil ditambah. Stok sekarang:" + this.stok);
        }
    }
    
    public void kurangiStok(int jumlah){
        if (stok > 0 && (this.stok - jumlah) >= 0){
            this.stok -= jumlah;
            System.out.println("Stok berhasil dikurangi. Sisa stok:" + this.stok);
        } else {
          System.out.println("Error: Pengurangan gagal! Stok tidak cukup atau jumlah tidak valid.");  
        }
    }
}
