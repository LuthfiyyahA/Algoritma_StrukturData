import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        Sort15 data = new Sort15; 
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
            int posisi = data.FindSeqSearch(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
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
