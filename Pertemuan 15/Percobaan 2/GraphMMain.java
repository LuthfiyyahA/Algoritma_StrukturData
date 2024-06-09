import java.util.Scanner;
public class GraphMMain {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Add Edge");
        System.out.println("2. Remove Edge");
        System.out.println("3. Degree");
        System.out.println("4. Print Graph");
        System.out.println("5. Cek Edge");
        System.out.println("6. Hitung Edge");
        System.out.println("7. Keluar");
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertex : ");
        int v = sc.nextInt();
        GraphMatriks15 gdg = new GraphMatriks15(v);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan gedung asal : ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak gedung : ");
                    int jarak = sc.nextInt();
                    gdg.makeEdge(asal, tujuan, jarak);
                    System.out.println("-------------------------------");
                    break;
                
                case 2:
                    System.out.print("Masukkan asal gedung yang akan dihapus : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan yang akan dihapus : ");
                    tujuan = sc.nextInt();
                    gdg.removeEdge(asal, tujuan);
                    System.out.println("-------------------------------");
                    break;

                case 3:
                    System.out.print("Masukkan vertex untuk mengecek degree : ");
                    asal = sc.nextInt();
                    gdg.degree(asal);
                    System.out.println("-------------------------------");
                    break;

                case 4:
                    gdg.printGraph();
                    System.out.print("-------------------------------");
                    break;

                case 5:
                    System.out.print("Masukkan asal gedung : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    tujuan = sc.nextInt();
                    gdg.cekEdge(asal, tujuan);
                    System.out.println("-------------------------------");
                    break;
                
                case 6:
                    gdg.hitungEdge();
                    System.out.println("-------------------------------");
                    break;

                case 7:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}