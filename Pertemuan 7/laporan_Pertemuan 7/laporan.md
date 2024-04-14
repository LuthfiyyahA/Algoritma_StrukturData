<div align="center">
<h1> Laporan Praktikum Pertemuan 7</h1>
<img src = "./gambar/Logo Polinema.png">

<h3> NIM     : 2341720148 </h3>
<h3> Nama    : Luthfiyyah Adzka Nur Shabrina </h3> 
<h3> Kelas   : TI-1H</h3>
</div>

----
## 1. Percobaan 1: Searching / Pencarian Menggunakan Agoritma Sequential Search
* ### Kode Program 1
    ```java
    public class Buku15 {
        int kodeBuku;
        String judulBuku;
        int tahunTerbit;
        String pengarang;
        int stock;

        public Buku15(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang,int stock) {
            //kodeBuku = kodeBuku;
            this.kodeBuku = kodeBuku;
            //judulBuku = judulBuku;
            this.judulBuku = judulBuku;
            //tahunTerbit = tahunTerbit;
            this.tahunTerbit = tahunTerbit;
            //pengarang = pengarang;
            this.pengarang = pengarang;
            //stock = stock;
            this.stock = stock;
        }

        public void tampilDataBuku() {
            System.out.println("=========================");
            System.out.println("Kode buku\t : "+kodeBuku);
            System.out.println("Judul buku\t : "+judulBuku);
            System.out.println("Tahun terbit\t : "+tahunTerbit);
            System.out.println("Pengarang\t : "+pengarang);
            System.out.println("Stock\t\t : "+stock);        
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class PencarianBuku15 {
        Buku15 listBk[] = new Buku15[5];
        int idx;

        void tambah(Buku15 m) {
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        void tampil() {
            //for (Buku15 m : listBk[]) {
            for (Buku15 m : listBk) {
                m.tampilDataBuku();
            }
        }

        public int FindSeqSearch(int cari) {
            //int posisi = 2;
            int posisi = -1;
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku==cari) {
                    //j = posisi;
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        public void Tampilposisi(int x, int pos) {
            if (pos!= -1) {
                System.out.println("Data : "+ x +" ditemukan pada indeks "+pos);
            } else {
                System.out.println("Data "+ x +" tidak ditemukan");
            }
        }

        public void TampilData(int x, int pos) {
            if (pos!= -1) {
                System.out.println("Kode buku\t : "+ x);
                System.out.println("Judul buku\t : "+listBk[pos].judulBuku);
                System.out.println("Tahun terbit\t : "+listBk[pos].tahunTerbit);
                System.out.println("Pengarang\t : "+listBk[pos].pengarang);
                System.out.println("Stock\t\t : "+listBk[pos].stock);
            } else {
                System.out.println("data "+ x +" tidak ditemukan");
            }
        }
    }
    ```
* ### Kode Program 3
    ```java
    import java.util.Scanner;

    public class BukuMain15 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);

            PencarianBuku15 data = new PencarianBuku15();
            int jumBuku = 5;

            System.out.println("------------------------------------------------------------------");
            System.out.println("Masukkan data Buku secara Urut dari Kode Buku Terkecil : ");
            for (int i = 0; i < jumBuku; i++) {
                System.out.println("------------------------------------------------------------------");
                System.out.print("Kode buku\t : ");
                int kodeBuku = s.nextInt();
                System.out.print("Judul buku\t : ");
                String judulBuku = s1.nextLine();
                System.out.print("Tahun terbit\t : ");
                int tahunTerbit = s.nextInt();
                System.out.print("Pengarang\t : ");
                String pengarang = s1.nextLine();
                System.out.print("Stock\t\t : ");
                int stock = s.nextInt();

                Buku15 m = new Buku15(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
                data.tambah(m);
            }

            System.out.println("------------------------------------------------------");
            System.out.println("Data keseluruhan Buku : ");
            data.tampil();

            System.out.println("------------------------------------------------------");
            System.out.println("Pencarian Data : ");
            System.out.println("------------------------------------------------------");
            System.out.println("Masukkan Kode Buku yang dicari : ");
            System.out.print("Kode Buku : ");
            int cari = s.nextInt();

            System.out.println("=======================================================");
            System.out.println("menggunakan Sequential Search");
            int posisi = data.FindSeqSearch(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
        }
    }
    ```
* ### Output Kode
    <img src = "./gambar/Percobaan 1.png">
* ### Pertanyaan
    1. Jelaskan fungsi break yang ada pada method FindSeqSearch!
    2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
    3.  Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe method dari FindBuku adalah BukuNoAbsen.  Sehingga Anda bisa memanggil method tersebut pada class BukuMain seperti gambar berikut : 
    <img src = "./gambar/Percobaan 1.png">
* ### Jawaban
    1. 
    2. 
    3. 
## 2. Percobaan 2: Searching / Pencarian Menggunakan Binary Search
* ### Kode Program 1
    ```java
    public class Buku15 {
        int kodeBuku;
        String judulBuku;
        int tahunTerbit;
        String pengarang;
        int stock;

        public Buku15(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang,int stock) {
            this.kodeBuku = kodeBuku;
            this.judulBuku = judulBuku;
            this.tahunTerbit = tahunTerbit;
            this.pengarang = pengarang;
            this.stock = stock;
        }

        public void tampilDataBuku() {
            System.out.println("=========================");
            System.out.println("Kode buku\t : "+kodeBuku);
            System.out.println("Judul buku\t : "+judulBuku);
            System.out.println("Tahun terbit\t : "+tahunTerbit);
            System.out.println("Pengarang\t : "+pengarang);
            System.out.println("Stock\t\t : "+stock);        
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class PencarianBuku15 {
        Buku15 listBk[] = new Buku15[5];
        int idx;

        void tambah(Buku15 m) {
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        void tampil() {
            //for (Buku15 m : listBk[]) {
            for (Buku15 m : listBk) {
                m.tampilDataBuku();
            }
        }

        public int FindSeqSearch(int cari) {
            //int posisi = 2;
            int posisi = -1;
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku==cari) {
                    //j = posisi;
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        public int FindBinarySearch(int cari, int left, int right) {
            int mid;
            if (right >= left) {
                //mid = (right) / 2;
                mid = (left + right) / 2;
                if (cari == listBk[mid].kodeBuku) {
                    return (mid);
                } else if (listBk[mid].kodeBuku > cari) {
                    //return FindBinarySearch(cari, left, mid);
                    return FindBinarySearch(cari, left, mid - 1);
                } else {
                    //return FindBinarySearch(cari, mid, right);
                    return FindBinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }

        public void Tampilposisi(int x, int pos) {
            if (pos!= -1) {
                System.out.println("Data : "+ x +" ditemukan pada indeks "+pos);
            } else {
                System.out.println("Data "+ x +" tidak ditemukan");
            }
        }

        public void TampilData(int x, int pos) {
            if (pos!= -1) {
                System.out.println("Kode buku\t : "+ x);
                System.out.println("Judul buku\t : "+listBk[pos].judulBuku);
                System.out.println("Tahun terbit\t : "+listBk[pos].tahunTerbit);
                System.out.println("Pengarang\t : "+listBk[pos].pengarang);
                System.out.println("Stock\t\t : "+listBk[pos].stock);
            } else {
                System.out.println("data "+ x +" tidak ditemukan");
            }
        }
    }
    ```
* ### Kode Program 3
    ```java
    import java.util.Scanner;

    public class BukuMain15 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);

            PencarianBuku15 data = new PencarianBuku15();
            int jumBuku = 5;

            System.out.println("------------------------------------------------------------------");
            System.out.println("Masukkan data Buku secara Urut dari Kode Buku Terkecil : ");
            for (int i = 0; i < jumBuku; i++) {
                System.out.println("------------------------------------------------------------------");
                System.out.print("Kode buku\t : ");
                int kodeBuku = s.nextInt();
                System.out.print("Judul buku\t : ");
                String judulBuku = s1.nextLine();
                System.out.print("Tahun terbit\t : ");
                int tahunTerbit = s.nextInt();
                System.out.print("Pengarang\t : ");
                String pengarang = s1.nextLine();
                System.out.print("Stock\t\t : ");
                int stock = s.nextInt();

                Buku15 m = new Buku15(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
                data.tambah(m);
            }

            System.out.println("------------------------------------------------------");
            System.out.println("Data keseluruhan Buku : ");
            data.tampil();

            System.out.println("------------------------------------------------------");
            System.out.println("Pencarian Data : ");
            System.out.println("------------------------------------------------------");
            System.out.println("Masukkan Kode Buku yang dicari : ");
            System.out.print("Kode Buku : ");
            int cari = s.nextInt();

            System.out.println("=======================================================");
            System.out.println("menggunakan Sequential Search");
            int posisi = data.FindSeqSearch(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);

            System.out.println("=======================================================");
            System.out.println("menggunakan Sequential Search");
            posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
        }
    }
    ```
* ### Output Kode
    <img src = "./gambar/Percobaan 2.png">
* ### Pertanyaan
    1. Tunjukkan pada kode program yang mana proses divide dijalankan! 
    2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
    3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? 
    4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai! 
* ### Jawaban
    1. 
    2. 
    3. 
    4. 
## 3. Percobaan 3: Percobaan Pengayaan Divide and Conquer 
* ### Kode Program 1
    ```java
    public class MergeSort15 {
        public void mergeSort(int[] data) {
            sort(data, 0, data.length - 1);
        }

        public void merge(int data[], int left, int middle, int right) {
            int[] temp = new int[data.length];

            for (int i = left; i <= right; i++) {
                temp[i] = data[i];
            }

            int a = left;
            int b = middle + 1;
            int c = left;

            while (a <= middle && b <= right) {
                if (temp[a] <= temp[b]) {
                    data[c] = temp[a];
                    a++;
                } else {
                    data[c] = temp[b];
                    b++;
                }
                c++;
            }

            int s = middle - a;
            for (int i = 0; i < s; i++) {
                data[c + i] = temp[a + i];
            }
        }

        public void sort(int data[], int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;
                sort(data, left, middle);
                sort(data, middle + 1, right);
                merge(data, left, middle, right);
            }
        }

        public void printArray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] +" ");
            }

            System.out.println();
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class MergeSortMain15 {
        public static void main(String[] args) {
            int data[] = {10, 40, 30, 50, 70, 20,100, 90};
            System.out.println("Sorting dengan Merge Sort");
            MergeSort15 mSort = new MergeSort15();
            System.out.println("data awal");
            mSort.printArray(data);
            mSort.mergeSort(data);
            System.out.println("setelah diurutkan");
            mSort.printArray(data);
        }
    }
    ```

* ### Output Kode
    <img src = "./gambar/Percobaan 3.png">

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