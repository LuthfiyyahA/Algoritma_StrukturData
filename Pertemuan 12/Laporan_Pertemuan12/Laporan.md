<div align="center">
<h1> Laporan Praktikum Pertemuan 12</h1>
<img src = "./gambar/Logo Polinema.png">

<h3> NIM     : 2341720148 </h3>
<h3> Nama    : Luthfiyyah Adzka Nur Shabrina </h3> 
<h3> Kelas   : TI-1H</h3>
</div>

----
## 1. Percobaan 1: 
* ### Kode Program 1
    ```java
    public class Node {
        int data;
        Node prev, next;

        Node(Node prev, int data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class DoubleLinkedList {
        Node head;
        int size;

        public DoubleLinkedList() {
            head = null;
            size = 0;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void addFirst(int item) {
            if (isEmpty()) {
                head = new Node(null, item, null);
            } else {
                Node newNode = new Node(null, item, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void addLast(int item) {
            if (isEmpty()) {
                addFirst(item);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }

                Node newNode = new Node(current, item, null);
                current.next = newNode;
                size++;
            }
        }

        public void add(int item, int index) throws IndexOutOfBoundsException {
            if (isEmpty()) {
                addFirst(item);
            } else if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Nilai indeks di luar batas");
            } else {
                Node current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }

                if (current.prev == null) {
                    Node newNode = new Node(null, item, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    Node newNode = new Node(current.prev, item, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void clear() {
            head = null;
            size = 0;
        }

        public void print() {
            if (!isEmpty()) {
                Node tmp = head;
                while (tmp != null) {
                    System.out.print(tmp.data + "\t");
                    tmp = tmp.next;
                }

                System.out.println("\nBerhasil diisi");
            } else {
                System.out.println("Linked Lists Kosong");
            }
        }
    }    
    ```
* ### Kode Program 3
    ```java
    public class DLLMain {
        public static void main(String[] args) {
            DoubleLinkedList dll = new DoubleLinkedList();

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
        }
    }    
    ```
* ### Output Kode
    <img src = "./gambar/Percobaan 1.png">
* ### Pertanyaan
    1. Jelaskan perbedaan antara single linked list dengan double linked lists!
    2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?
    3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?
        <img src = "./gambar/Pertanyaan 3 P1.png">
    4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?
        Node newNode = new Node(null, item, head);
    5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
    6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?
        Node newNode = new Node(current, item, null);
* ### Jawaban
    1. 
    2. 
    3. 
## 2. Percobaan 2: 
* ### Kode Program 1
    ```java
    
    ```
* ### Kode Program 2
    ```java
    
    ```
* ### Kode Program 3
    ```java
    
    ```
* ### Output Kode
    <img src = "./gambar/Percobaan 2.png">
* ### Pertanyaan
    1. Apakah maksud statement berikut pada method removeFirst()?
        head = head.next;
        head.prev = null;
    2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
    3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
    4. Jelaskan fungsi kode program berikut ini pada fungsi remove!
* ### Jawaban
    1. 
    2. 
    3. 
    4. 
## 3. Percobaan 3: 
* ### Kode Program 1
    ```java
    
    ```
* ### Kode Program 2
    ```java
    
    ```
* ### Kode Program 3
    ```java
    
    ```
* ### Output Kode
    <img src = "./gambar/Percobaan 3.png">
* ### Pertanyaan
    1. 
    <img src = "./gambar/P3 no2.png">
    2. 
    3. 

* ### Jawaban
    1. 
    2. 
    3. 
## 4. Latihan Praktikum
* ## Tugas
    * ### Kode Program 1
        ```java
        
        ```
    * ### Kode Program 2
        ```java
        
        ```
    * ### Kode Program 3
        ```java
        
        ```
    * ### Output Kode
        <img src = "./gambar/Tugas 2.png">