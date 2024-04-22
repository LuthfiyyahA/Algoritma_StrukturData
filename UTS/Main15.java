import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        Sort15 nil = new Sort15();

        int data[] = {23, 28, 39, 3, 13, 2, 0, 25, 14, 44, 22, 20, 10, 7, 34, 40, 20};
        System.out.println("Sorting dengan Merge Sort");
        System.out.println("--------------------------");
        Sort15 mSort = new Sort15();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.Sort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);

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
            System.out.println("Masukkan Angka yang dicari");
            System.out.print("Angka : ");
            String cari = s1.nextLine();

            System.out.println("=======================================================");
            System.out.println("menggunakan Sequential Search");
            int posisi;
            posisi = nil.FindSeqSearch(cari);
            nil.Tampilposisi(cari, posisi);
            nil.TampilData(cari, posisi);
                break;
        
            case 2:
            System.out.println("Masukkan Kode Buku yang dicari : ");
            System.out.print("Kode Buku : ");
            String search = s.nextLine();
            
            System.out.println("=======================================================");
            System.out.println("menggunakan Binary Search");
            posisi = nil.FindBinarySearch(search, 0, jumBuku - 1);
            nil.Tampilposisi(search, posisi);
            nil.TampilData(search, posisi);
                break;
        }
        s.close();
        s1.close();
    }
}
