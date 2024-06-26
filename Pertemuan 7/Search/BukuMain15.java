import java.util.Scanner;

public class BukuMain15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku15 data = new PencarianBuku15();
        int jumBuku = 5;

        System.out.println("------------------------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari Kode Buku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------------------------------------------------------");
            System.out.print("Kode buku\t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku\t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit\t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock\t\t : ");
            int stock = s.nextInt();

            Buku15 m = new Buku15(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        
        System.out.println("------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("\n------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("1. Berdasarkan Sequential Search");
        System.out.println("2. Berdasarkan Binary Search");
        System.out.print("\nPilih : ");
        int pilih = s.nextInt();
        s.nextLine();
        System.out.println("------------------------------------------------------");

        switch (pilih) {
            case 1:
            System.out.println("Masukkan Kode Buku yang dicari");
            System.out.print("Kode Buku : ");
            String cari = s1.nextLine();

            System.out.println("=======================================================");
            System.out.println("menggunakan Sequential Search");
            int posisi = data.FindSeqSearch(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);

            Buku15 dataBuku = data.FindBuku(cari);
            dataBuku.tampilDataBuku();
                break;
        
            case 2:
            System.out.println("Masukkan Kode Buku yang dicari : ");
            System.out.print("Kode Buku : ");
            String search = s.nextLine();
            
            System.out.println("=======================================================");
            System.out.println("menggunakan Binary Search");
            posisi = data.FindBinarySearch(search, 0, jumBuku - 1);
            data.Tampilposisi(search, posisi);
            data.TampilData(search, posisi);
                break;
        }
        s.close();
        s1.close();
    }
}