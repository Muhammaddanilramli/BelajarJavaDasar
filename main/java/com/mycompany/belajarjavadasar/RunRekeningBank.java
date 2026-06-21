/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
public class RunRekeningBank {
    public static void main(String[] args){
        RekeningBank rek = new RekeningBank("123456", 10000000);
        
        rek.tarik(500000);
        rek.setor(200000);
        rek.tarik(2000000);
        
        System.out.println("Saldo Akhir: Rp " + rek.getSaldo());
    }
}
