package Percobaan;

import java.util.Scanner;
public class DLLMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Add");
        System.out.println("2. Get");
        System.out.println("3. Remove");
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    dll.print();
                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    dll.addFirst(3);
                    dll.addLast(4);
                    dll.addFirst(7);
                    dll.print();

                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    dll.add(40, 1);
                    dll.print();
                
                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    dll.clear();
                    dll.print();

                    System.out.println("Size : " +dll.size());
                    break;
            
                case 2:
                    dll.print();
                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    dll.addFirst(3);
                    dll.addLast(4);
                    dll.addFirst(7);
                    dll.print();

                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    dll.add(40, 1);
                    dll.print();

                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    System.out.println("Data awal pada Linked List adalah : " +dll.getFirst());
                    System.out.println("Data akhir pada Linked List adalah : " +dll.getLast());
                    System.out.println("Data indeks ke-1 pada Linked List adalah : " +dll.get(1));
                    break;
                
                case 3:
                    dll.addLast(50);
                    dll.addLast(40);
                    dll.addLast(10);
                    dll.addLast(20);
                    dll.print();

                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    dll.removeFirst();
                    dll.print();

                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    dll.removeLast();
                    dll.print();

                    System.out.println("Size : " +dll.size());
                    System.out.println("==================================");
                    dll.remove(1);
                    dll.print();

                    System.out.println("Size : " +dll.size());
                    break;
            }
        }

        while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}