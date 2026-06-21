/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan13;

/**
 *
 * @author LENOVO
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class KalkulatorPrmbagianAman {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean inputValid = false;
        
        while (!inputValid){
            try{
                System.out.print("Masukkan angka Pertama; ");
                int angka1 = scan.nextInt();
                
                System.out.print("Masukkan angka Kedua; ");
                int angka2 = scan.nextInt();
                
                int hasil = angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasil);
                inputValid = true;
                
            } catch (InputMismatchException e){
              System.out.println("Error: Input harus berupa angka bulat! Silahkan coba lagi.\n");
            scan.next();  
            } catch (ArithmeticException e){
                System.out.println("Error: Tidak bisa membagi dengan angka nol (0)! Silahkan coba lagi.\n");
                
            }
        } 
        scan.close();
    System.out.println("Program Selesai");
    
    }
    
}
