public class LinkedList {
    Mahasiswa15 head, tail;
    
    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Mahasiswa15 tmp = head;
            System.out.println("\nIsi Linked list");

            while (tmp != null) {
                System.out.println("______________");
                System.out.println("NIM  : " +tmp.nim + "\nNama : " +tmp.nama);
                tmp = tmp.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int nim, String nama) {
        Mahasiswa15 ndInput = new Mahasiswa15(nim, nama);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int nim, String nama) {
        Mahasiswa15 ndInput = new Mahasiswa15(nim, nama);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        Mahasiswa15 ndInput = new Mahasiswa15(nim, nama);
        Mahasiswa15 temp = head;

        do {
            if (temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;

                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }

            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int nim, String nama) {
        if (index < 0) {
            System.out.println("Perbaiki logikanya!" + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(nim, nama);
        } else {
            Mahasiswa15 temp = head;

            for (int i = 0; i < index - 1; i++) {
               if (temp.next == null) {
                System.out.print("index melebihi batas");
                return;
               }

               temp = temp.next;
            }
            
            Mahasiswa15 ndInput = new Mahasiswa15(nim, nama);
            ndInput.next = temp.next;
            temp.next = ndInput;

            if (ndInput.next == null) {
                tail =  ndInput;
            }
        }
    }
}