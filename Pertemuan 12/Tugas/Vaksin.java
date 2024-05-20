package Tugas;

import java.util.Scanner;
public class Vaksin {
    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++\n");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLQueue queue = new DLLQueue(10);
        
        int pilih;
        do {
            menu();
            System.out.print("Masukkan pilihan Anda: ");
            pilih = sc.nextInt();
            sc.nextLine();  // Mengonsumsi newline yang tersisa

            switch (pilih) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Antrian sudah penuh!");
                    } else {
                        System.out.println("-----------------------------");
                        System.out.println("Masukkan data penerima vaksin");
                        System.out.println("-----------------------------");
                        System.out.println("Nomor Antrian :");
                        int no = sc.nextInt();
                        System.out.println("Nama Penerima :");
                        String nama = sc.nextLine();
                        queue.enqueue(no, nama);;
                        System.out.println("Data berhasil ditambahkan.");
                    }
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Antrian kosong, tidak ada data untuk dihapus.");
                    } else {
                        int removedData = queue.dequeue();
                        System.out.println("Data yang dihapus: " + removedData);
                    }
                    break;
                case 3:
                    System.out.println("Daftar Penerima Vaksin:");
                    queue.print();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 4);

        sc.close();
    }
}