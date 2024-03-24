import java.util.Scanner;

public class MhsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int c = sc.nextInt();

        Mhs[] mahasiswa = new Mhs[c];
        sc.nextLine();

        
        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new Mhs();

            System.out.println("Masukkan data mahasiswa ke-"+ (i+1));
            System.out.print("Masukkan nama          : ");
            mahasiswa[i].nama = sc.nextLine();

            System.out.print("Masukkan NIM           : ");
            mahasiswa[i].nim = sc.nextInt();

            System.out.print("Masukkan jenis kelamin : ");
            mahasiswa[i].jK = sc.next().charAt(0);

            System.out.print("Masukkan IPK           : ");
            mahasiswa[i].ipk = sc.nextDouble();
            sc.nextLine();
        }
        
        Mhs mhs = new Mhs();
        mhs.tampilData(mahasiswa);
        System.out.print("\n");

        double rataRata = mhs.hitungRataRata(mahasiswa);
        System.out.println("-------------------------------------");
        System.out.printf("%-30s : %-4.2f","Rata-rata IPK mahasiswa adalah", rataRata);
        System.out.print("\n");

        double ipkBesar = mhs.cariIpkTerbesar(mahasiswa);
        System.out.println("-------------------------------------");
        System.out.println("IPK mahasiswa Terbesar adalah  : "+ ipkBesar);
        System.out.println("-------------------------------------");

        sc.close();
    }
} 