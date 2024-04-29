import java.util.Scanner;

public class NasabahMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();

        Queue2 antri = new Queue2(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc.nextLine();
                    System.out.print("No Rekening : ");
                    String nama = sc.nextLine();
                    System.out.print("No Rekening : ");
                    String alamat = sc.nextLine();
                    System.out.print("No Rekening : ");
                    int umur = sc.nextInt();
                    System.out.print("No Rekening : ");
                    double saldo = sc.nextDouble();

                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                
                case 2:
                    Nasabah data = antri.Dequeue();

                    if (!" ".equals(data.norek) && !" ".equals(data.nama) && !" ".equals(data.alamat) && data.umur !=0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}