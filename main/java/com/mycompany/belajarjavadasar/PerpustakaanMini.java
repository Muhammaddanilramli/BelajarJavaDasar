/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class PerpustakaanMini {
    static String[] daftarBuku = {"Java Dasar", "Struktur Data", "Web Design", "Basis Data"};

    static void tampilkanDaftarBuku() {
        System.out.println("\n=== DAFTAR BUKU TERSEDIA ===");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i]);
        }
        System.out.println("----------------------------");
    }

    static boolean cariBuku(String judul) {
        for (String buku : daftarBuku) {
            if (buku.equalsIgnoreCase(judul)) {
                return true;
            }
        }
        return false;
    }

    static void tampilkanMenu() {
        System.out.println("\n===== MENU PERPUSTAKAAN =====");
        System.out.println("1. Tampilkan Semua Buku");
        System.out.println("2. Cari Judul Buku");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu (1-3): ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = scan.nextInt();
            scan.nextLine(); // Membersihkan buffer setelah nextInt()

            switch (pilihan) {
                case 1:
                    tampilkanDaftarBuku();
                    break;
                case 2:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String inputJudul = scan.nextLine();
                    if (cariBuku(inputJudul)) {
                        System.out.println("✅ Buku '" + inputJudul + "' tersedia.");
                    } else {
                        System.out.println("❌ Buku '" + inputJudul + "' tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah berkunjung!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 3);

        scan.close();
    }
}
