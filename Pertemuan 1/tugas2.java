import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("____________________");
            System.out.println("Menu:");
            System.out.println("1. Menghitung Kecepatan");
            System.out.println("2. Menghitung Jarak");
            System.out.println("3. Menghitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            System.out.print("--------------------");
            System.out.println("\n");

            switch (menu) {
                case 1:
                System.out.println("Kecepatannya yaitu : " + hitungKecepatan() + " Km/jam");
                System.out.print("\n");
                    break;
                case 2:
                System.out.println("Jaraknya yaitu : " + hitungJarak() + " Km");
                System.out.print("\n");
                    break;
                case 3:
                System.out.println("Waktunya yaitu : " + hitungWaktu() + " jam");
                System.out.print("\n");
                    break;
                case 4:
                System.out.println("Terimakasih telah menggunakan program ini");
                System.out.print("\n");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
                    System.out.print("\n");
            }
        }
    }

    static double hitungKecepatan() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jarak (km)  : ");
        double s = sc.nextDouble();
        
        System.out.print("Masukkan waktu (jam) : ");
        double t = sc.nextDouble();

        System.out.print("\n");

        return s / t;
    }

    static double hitungJarak() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kecepatan (km/jam) : ");
        double v = sc.nextDouble();
        
        System.out.print("Masukkan waktu (jam)        : ");
        double t = sc.nextDouble();

        System.out.print("\n");

       return v * t;
    }

    static double hitungWaktu() {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Masukkan jarak (km)         : ");
       double s = sc.nextDouble();
       
       System.out.print("Masukkan kecepatan (km/jam) : ");
       double v = sc.nextDouble();

       System.out.print("\n");

      return s / v;
   }
}