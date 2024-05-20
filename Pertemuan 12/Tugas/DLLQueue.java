package Tugas;

public class DLLQueue {
    Node head, tail;
    int size, max;

    public DLLQueue(int max) {
        this.max = max;
        this.size = 0;
        head = tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(int no, String nama) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        Node newNode = new Node(no, nama);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return -1;
        }
        int data = head.no;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.no + " ");
            current = current.next;
        }
        System.out.println();
    }
}