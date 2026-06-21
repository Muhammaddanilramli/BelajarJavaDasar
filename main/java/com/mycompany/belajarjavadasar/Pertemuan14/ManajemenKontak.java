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
import java.util.Scanner;
public class ManajemenKontak {
    public static void main(String[] args){
        ArrayList<Kontak> daftarKontak = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=== MENU MANAJEMEN KONTAK ===");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Cari Kontak");
            System.out.println("3. Hapus Kontak");
            System.out.println("4. Tampilkan Semua Kontak");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5)");
            
            pilihan = scan.nextInt();
            scan.nextLine();
            
            switch (pilihan){
            
                case 1:
                  System.out.print("Masukan Nama: ");
                  String nama = scan.nextLine();
                  System.out.print("Masukan Nomor Telepon: ");
                  String telp = scan.nextLine();
                  
                  daftarKontak.add(new Kontak(nama, telp));
                  System.out.println("Kontak berhasil ditambahkan!");
                  break;
                  case 2:
                  System.out.print("Masukan nama yang dicari: ");
                  String cariNama = scan.nextLine();
                  boolean ditemukanCari = false;
                  
                  for (Kontak k: daftarKontak){
                      if (k.getNama().equalsIgnoreCase(cariNama)){
                          k.tampilkanKontak();
                          ditemukanCari = true;
                      }
                  }
                  if (!ditemukanCari){
                      System.out.println("Kontak dengan nama '" + cariNama + "' tidak ditemukan. ");
                      
                  }
                  break;
                  case 3:
                  System.out.print("Masukkan nama kontak yang ingin di hapus: ");
                  String hapusNama =scan.nextLine();
                  boolean ditemukanHapus = false;
                  
                  for (int i = 0; i < daftarKontak.size(); i++){
                      if (daftarKontak.get(i).getNama().equalsIgnoreCase(hapusNama)){
                          System.out.println("Kontak '" + hapusNama + "' berhasil dihapus.");
                          ditemukanHapus = true;
                          break;
                      }
                  }
                  if (!ditemukanHapus){
                      System.out.println("Kontak tidak ditemukan, gagalmenghapus.");
                  }
                    break;
                
                case 4:
                System.out.println("\n--- DAFTAR SEMUA KONTAK ---");
                if (daftarKontak.isEmpty()){
                    System.out.println("[Belum ada kontak terdaftar]");
                }else{
                    for (Kontak k : daftarKontak){
                        k.tampilkanKontak();
                    }
                }
                break;
                
                case 5:
                    System.out.println("Terimakasih!");
                    
                 default:   
                     System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan !=5);
        
        scan.close();
    }   
    
}
