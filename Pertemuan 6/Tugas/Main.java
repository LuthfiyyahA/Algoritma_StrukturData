package Tugas;

public class Main {
    public static void main(String[] args) {
        HotelService list = new HotelService();

        Hotel H1 = new Hotel("The Singhasari", "Batu", 650250, (byte)5);
        Hotel H2 = new Hotel("Gets Hotel", "Malang", 350000, (byte)4);
        Hotel H3 = new Hotel("Ijen Suites", "Malang", 484330, (byte)5);
        Hotel H4 = new Hotel("Favehotel MEX", "Surabaya", 327520, (byte)4);
        Hotel H5 = new Hotel("Grand Surabaya", "Surabaya", 286663, (byte)3);

        list.tambah(H1);
        list.tambah(H2);
        list.tambah(H3);
        list.tambah(H4);
        list.tambah(H5);

        System.out.println("____________________________");
        System.out.println("|Data Hotel Sebelum Sorting|");
        System.out.println("----------------------------");
        list.tampil();

        System.out.println("\n__________________________________________________");
        System.out.println("|Data Hotel Setelah Bubble Sort Berdasarkan Harga|");
        System.out.println("--------------------------------------------------");
        list.bubbleSortHarga();
        list.tampil();

        System.out.println("\n_____________________________________________________");
        System.out.println("|Data Hotel Setelah Selection Sort Berdasarkan Harga|");
        System.out.println("-----------------------------------------------------");
        list.selectionSortHarga();
        list.tampil();

        System.out.println("\n____________________________________________________");
        System.out.println("|Data Hotel Setelah Bubble Sort Berdasarkan Bintang|");
        System.out.println("----------------------------------------------------");
        list.bubbleSortBintang();
        list.tampil();

        System.out.println("\n_______________________________________________________");
        System.out.println("|Data Hotel Setelah Selection Sort Berdasarkan Bintang|");
        System.out.println("-------------------------------------------------------");
        list.selectionSortBintang();
        list.tampil();
    }
}