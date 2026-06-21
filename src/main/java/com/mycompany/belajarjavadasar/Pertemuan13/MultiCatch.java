/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan13;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class MultiCatch {
    public static void main(String[] args){
        int[] angka = {10, 20, 30,};
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan index array (0-2): ");
            int idx = scan.nextInt();
            
            System.out.println("Isi array: " + angka[idx]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index yang Anda Masukkan tidak ada!");
        } catch (Exception e) {
            System.out.println("Terjadi error umum: " + e.getMessage());
        }
        
        scan.close();
    }
    
}
