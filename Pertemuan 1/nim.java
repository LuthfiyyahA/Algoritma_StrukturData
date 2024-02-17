import java.util.Scanner;

public class nim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 0, nim;

        System.out.print("Masukkan Nim : ");
        nim = sc.nextLong();

        n = Math.abs(nim % 100);
        if (n < 10) {
            n += 10;
        }

        System.out.println("========================");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}