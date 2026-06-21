/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class RekeningBank {
    private String nomorRekening;
    private double saldo;
    
    public RekeningBank(String noRek, double saldoAwal){
        this.nomorRekening = noRek;
        if (saldoAwal >= 0){
        }else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak valid, di-set 0.");
            
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setor(double jumlah){
        if (jumlah > 0){
            saldo = saldo + jumlah;
            System.out.println("Setor Rp " + jumlah + "berhasil. Saldo saat ini: ");
        }else {
            System.out.println("Jumlah setor harus positif!");
        }
    }
    
    public void tarik(double jumlah){
        if (jumlah > 0 && jumlah <= saldo){
            saldo = saldo -  jumlah;
            System.out.println("Tarik Rp " + jumlah + "Berhasil. Sisa saldo:");
            
        }else {
            System.out.println("Penarikan gagal! Sldo tidak cukup atau jumlah terlalu besar");
        }
    }
}
