public class Pembeli {
    String nama;
    int noHP;

    Pembeli() {

    }

    public Pembeli(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }
}

class Queue3 {
    Pembeli[] antrian;
    int front, rear, size, max;

    public Queue3(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public void Enqueue(Pembeli dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }

            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }

        return dt;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }

            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        int posisi = -1;
        if (!isEmpty()) {
            int index = front;
            int temp = 1;
            while (index != rear) {
                if (antrian[index].nama.equals(nama)) {
                    posisi = temp;
                    break;
                }
                index = (index + 1) % max;
                temp++;
            }
            if (antrian[index].nama.equals(nama)) {
                posisi = temp;
            }
        }
        if (posisi == -1) {
            System.out.println("Pembeli dengan nama " + nama + " tidak ditemukan dalam antrian.");
        } else {
            System.out.println("Pembeli dengan nama " + nama + " berada di posisi " + posisi + " dalam antrian.");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            System.out.println("Daftar seluruh pembeli");
            System.out.println("-----------------------");
            while (i != rear) {
                System.out.println(antrian[i].nama + "\n" + antrian[i].noHP + "\n");
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + "\n" + antrian[i].noHP + "\n");
        }
    }
}