/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan14;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
public class DemoArrayList {
     public static void main(String[]args){
      ArrayList<String> namaTeman = new ArrayList<>();
      
      namaTeman.add("Rangga");
      namaTeman.add("Icang");
      namaTeman.add("agym");
      namaTeman.add("Luki");
      
      System.out.println("Isi ArrayList: " + namaTeman);
      
      System.out.println("Data Index 0: " + namaTeman.get(0));
      System.out.println("Data Index 2: " + namaTeman.get(2));
      
      namaTeman.set(1, "Siti");
      System.out.println("Setelah diubah: " + namaTeman);
      
      namaTeman.remove(0);
      System.out.println("Setelah di hapus: " + namaTeman);
      
      System.out.println("Jumlah Data: " + namaTeman.size());

    }
}
