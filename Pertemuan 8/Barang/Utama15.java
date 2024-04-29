package Barang;

import java.util.Scanner;

public class Utama15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Tentukan kapasitas gudang : ");
        int kapasitas = s.nextInt();
        s.nextLine();

        Gudang15 gudang = new Gudang15(kapasitas);

        while (true) {
            System.out.println("\n------------------------------------------------------");
            System.out.println("Menu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("0. Keluar");
            System.out.print("\nPilih : ");
            int pilih = s.nextInt();
            s.nextLine();
            System.out.println("------------------------------------------------------");

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan kode barang   : ");
                    int kode = s.nextInt();
                    s.nextLine();
                    System.out.print("Masukkan nama barang   : ");
                    String nama = s.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = s.nextLine();
                    Barang15 barangBaru = new Barang15(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                    
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;

                case 6:
                    System.out.println("Masukkan nama barang : ");
                    String cari = s.nextLine();
                    gudang.cariBarang(cari);
                    break;
                    
                case 0:
                    break;
            
                default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
