package Tugas;

public class Node {
    int no;
    String nama;
    Node prev, next;

    Node(int no, String nama) {
        this.prev = null;
        this.no = no;
        this.nama = nama;
        this.next = null;
    }
}