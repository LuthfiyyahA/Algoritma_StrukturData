import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kode;
        boolean found = false;
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }};

        System.out.println("___________________________________");
        System.out.printf("| %-7s %-15s %-7s | \n", " ", "Kode Plat Mobil", " ");
        System.out.println("###################################");
        System.out.printf("| %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-1s | \n", "A,", "B,", "C,", "D,", "E,", "F,", "G,", "H,", "L,", "N,", "T");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Masukkan Kode Plat Mobil : ");
        kode = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < KODE.length && !found; i++) {
            if (KODE[i] == kode) {
                System.out.println("Nama Kota : " + String.valueOf(KOTA[i]));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Kode Plat Mobil Invalid");
        }
    }
}