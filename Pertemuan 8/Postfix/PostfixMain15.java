import java.util.Scanner;

public class PostfixMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;

        System.out.println("Masukkan ekpresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix15 post = new Postfix15(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
    
}