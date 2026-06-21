/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.Pertemuan13;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    public static void main(String[] args) {
        ArrayList<String> tugas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int pilihan = 0;
        
        do {
            System.out.println("\n=== APLIKASI TO-DO LIST ===");
            System.out.println("1. Lihat Tugas");
            System.out.println("2. Tambah Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("PILIH: ");
            
            pilihan = scan.nextInt();
            scan.nextLine(); // Membersihkan sisa enter setelah menginput angka
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Tugas ---");
                    if (tugas.isEmpty()) {
                        System.out.println("(Belum ada Tugas)");
                    } else {
                        // Memperbaiki perulangan agar membaca index dengan benar
                        for (int i = 0; i < tugas.size(); i++) {
                            System.out.println((i + 1) + ". " + tugas.get(i));
                        }
                    }
                    break;
                    
                case 2:
                    System.out.print("Masukkan tugas baru: ");
                    String tugasBaru = scan.nextLine();
                    tugas.add(tugasBaru);
                    System.out.println("Tugas berhasil ditambahkan!");
                    break;
                    
                case 3:
                    System.out.print("Masukkan nomor tugas yang dihapus: ");
                    int hapusIndex = scan.nextInt();
                    if (hapusIndex > 0 && hapusIndex <= tugas.size()) {
                        String removed = tugas.remove(hapusIndex - 1);
                        System.out.println("Tugas '" + removed + "' berhasil dihapus");
                    } else {    
                        System.out.println("Nomor tugas tidak valid!");
                    }
                    break;
                  
                case 4:
                    System.out.println("Sampai jumpa!");
                    break;
                    
                default:
                    System.out.println("Pilihan salah!");
            }
            
            // Perubahan penting: scan.nextLine() tambahan di sini sudah dihapus
            
        } while (pilihan != 4);
        
        scan.close();
    }
}
 