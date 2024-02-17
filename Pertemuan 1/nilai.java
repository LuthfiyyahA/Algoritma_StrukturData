import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double nilTugas, nilKuis, nilUTS, nilUAS, nilAkhir;
        String nilHuruf, ketLulus;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==========================");

        System.out.print("Masukkan Nilai Tugas : ");
        nilTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis  : ");
        nilKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS   : ");
        nilUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS   : ");
        nilUAS = sc.nextDouble();
        
        if (nilTugas < 0 || nilTugas > 100 || nilKuis < 0 || nilKuis > 100 || nilUTS < 0 || nilUTS > 100 || nilUAS < 0 || nilUAS > 100) {
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("nilai tidak valid");
            System.out.println("==========================");
            System.out.println("==========================");
            return;
        }

        nilAkhir = (0.2 * nilTugas) + (0.2 * nilKuis) + (0.3 * nilUTS) + (0.4 * nilUAS);

        if (nilAkhir > 80) {
            nilHuruf = "A";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilAkhir > 73) {
            nilHuruf = "B+";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilAkhir > 65) {
            nilHuruf = "B";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilAkhir > 60) {
            nilHuruf = "C+";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilAkhir > 50) {
            nilHuruf = "C";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilAkhir > 39) {
            nilHuruf = "D";
            ketLulus = "MOHON MAAF ANDA TIDAK LULUS";
        } else {
            nilHuruf = "E";
            ketLulus = "MOHON MAAF ANDA TIDAK LULUS";
        }

        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("Nilai akhir : " + nilAkhir);
        System.out.println("Nilai huruf : " + nilHuruf);
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println(ketLulus);
        
    }
}