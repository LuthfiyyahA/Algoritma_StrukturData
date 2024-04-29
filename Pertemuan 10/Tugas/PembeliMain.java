import java.util.Scanner;

public class PembeliMain {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("6. Tampilkan seluruh data pembeli");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();

        Queue3 antri = new Queue3(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP : ");
                    int noHP = sc.nextInt();

                    Pembeli nb = new Pembeli(nama, noHP);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                
                case 2:
                    Pembeli data = antri.Dequeue();

                    if (!" ".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.noHP);
                    }
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();
                    break;

                case 6:
                    antri.daftarPembeli();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
