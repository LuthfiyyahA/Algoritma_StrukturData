import java.util.Scanner;

public class ipSMT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilSetara, totNil = 0, ipSMT = 0;
        int sks = 18;
        String nilHuruf;
        String [][] matkuls = new String[8][2];
        double [][] angka = new double[8][2];
        double [] nilAngka = new double[8];


        for (int i = 0; i < 8; i++) {
            System.out.print("Mata Kuliah : ");
            String matkul = sc.nextLine();
            matkuls[i][0] = matkul;

            System.out.print("Bobot SKS : ");
            double bobotSKS = sc.nextDouble();
            angka[i][0] = bobotSKS;

            sc.nextLine();
        }

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        for (int i = 0; i < 8; i++) {
            System.out.printf("%-2s %-37s %s", "masukkan nilai Angka untuk MK", matkuls[i][0], ": ");
            double nilai = sc.nextDouble();
            nilAngka [i] = nilai;

            if (nilAngka[i] >= 81) {
                nilHuruf = "A";
                nilSetara = 4;
            }else if (nilAngka[i] >= 74) {
                nilHuruf = "B+";
                nilSetara = 3.5;
            } else if (nilAngka[i] >= 66) {
                nilHuruf = "B";
                nilSetara = 3;
            } else if (nilAngka[i] >= 61) {
                nilHuruf = "C+";
                nilSetara = 2.5;
            } else if (nilAngka[i] >= 51) {
                nilHuruf = "C";
                nilSetara = 2;
            } else if (nilAngka[i] >= 40) {
                nilHuruf = "D";
                nilSetara = 1;
            } else {
                nilHuruf = "E";
                nilSetara = 0;
            }

            matkuls[i][1] = nilHuruf;
            angka[i][1] = nilSetara;
            
        }

        System.out.println("======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("======================");

        System.out.printf("%-40s %-14s %-14s %s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s %-19.2f %-13s %.2f\n", matkuls[i][0], nilAngka[i], matkuls[i][1], angka[i][1]);
        }

        for (int i = 0; i < 8; i++) {
            totNil += angka[i][1] * angka[i][0];
        }

        ipSMT = totNil / sks;

        System.out.println("======================");
        System.out.printf("IP : %.2f%n", ipSMT);
    }
}