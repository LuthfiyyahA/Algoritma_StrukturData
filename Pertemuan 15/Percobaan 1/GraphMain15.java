import java.util.Scanner;
public class GraphMain15 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph15 gedung = new Graph15(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan gedung asal : ");
        int asal = sc.nextInt();
        System.out.print("Masukkan gedung tujuan : ");
        int tujuan = sc.nextInt();

        if (gedung.isAdjacent(asal, tujuan)) {
            System.out.print("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga\n");
            System.out.println("");
        } else {
            System.out.print("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga\n");
            System.out.println("");
        }

        System.out.print("Masukkan gedung asal : ");
        asal = sc.nextInt();
        System.out.print("Masukkan gedung tujuan : ");
        tujuan = sc.nextInt();

        if (gedung.isAdjacent(asal, tujuan)) {
            System.out.print("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga\n");
            System.out.println("");
        } else {
            System.out.print("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga\n");
            System.out.println("");
        }
    }
}