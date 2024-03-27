<div align="center">
<h1> Laporan Praktikum Pertemuan 5</h1>
<img src = "./gambar/Logo Polinema.png">

<h3> NIM     : 2341720148 </h3>
<h3> Nama    : Luthfiyyah Adzka Nur Shabrina </h3> 
<h3> Kelas   : TI-1H</h3>
</div>

----
## 1. Percobaan 1: Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
* ### Kode Program 1
    ```java
    public class Mahasiswa {
        String nama;
        int thnMasuk, umur;
        double ipk;

        Mahasiswa(String n, int t, int u, double i) {
            nama = n;
            thnMasuk = t;
            umur = u;
            ipk = i;
        }

        void tampil() {
            System.out.println("Nama = "+nama);
            System.out.println("Tahun Masuk = "+thnMasuk);
            System.out.println("Umur = "+umur);
            System.out.println("IPK = "+ipk);
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class DaftarMahasiswaBerprestasi {
        Mahasiswa listMhs[] = new Mahasiswa[5];
        int idx;

        void tambah(Mahasiswa m) {
            if (idx < listMhs.length) {
                listMhs[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!!");
            }
        }

        void tampil() {
            for (Mahasiswa m : listMhs) {
                m.tampil();
                System.out.println("-----------------------");
            }
        }

        void bubbleSort() {
            for (int i = 0; i < listMhs.length - 1; i++) {
                for (int j = 1; j < listMhs.length - i; j++) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }
    }
    ```
* ### Kode Program 3
    ```java
    public class Main {
        public static void main(String[] args) {
            DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();

            Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
            Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
            Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
            Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 35, 2);
            Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

            list.tambah(m1);
            list.tambah(m2);
            list.tambah(m3);
            list.tambah(m4);
            list.tambah(m5);

            System.out.println("Data mahasiswa sebelum sorting = ");
            list.tampil();

            System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
            list.bubbleSort();
            list.tampil();
        }
    }
    ```
* ### Output Kode
    <img src = "./gambar/Percobaan 1.png">
* ### Pertanyaan
    1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
    2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!
    3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !  
* ### Jawaban
    
## 2. Percobaan 2: Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
* ### Kode Program 1
    ```java
    public class Mahasiswa {
        String nama;
        int thnMasuk, umur;
        double ipk;

        Mahasiswa(String n, int t, int u, double i) {
            nama = n;
            thnMasuk = t;
            umur = u;
            ipk = i;
        }

        void tampil() {
            System.out.println("Nama = "+nama);
            System.out.println("Tahun Masuk = "+thnMasuk);
            System.out.println("Umur = "+umur);
            System.out.println("IPK = "+ipk);
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class DaftarMahasiswaBerprestasi {
        Mahasiswa listMhs[] = new Mahasiswa[5];
        int idx;

        void tambah(Mahasiswa m) {
            if (idx < listMhs.length) {
                listMhs[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!!");
            }
        }

        void tampil() {
            for (Mahasiswa m : listMhs) {
                m.tampil();
                System.out.println("-----------------------");
            }
        }

        void bubbleSort() {
            for (int i = 0; i < listMhs.length - 1; i++) {
                for (int j = 1; j < listMhs.length - i; j++) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }

        void selectionSort() {
            for (int i = 0; i < listMhs.length - 1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < listMhs.length; j++) {
                    //if (listMhs[j].ipk > listMhs[idxMin].ipk) {}
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin = j;
                    }
                }
                Mahasiswa tmp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp;
            }
        }
    }
    ```
* ### Kode Program 3
    ```java
    public class Main {
        public static void main(String[] args) {
            DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();

            Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
            Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
            Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
            Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 35, 2);
            Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

            list.tambah(m1);
            list.tambah(m2);
            list.tambah(m3);
            list.tambah(m4);
            list.tambah(m5);

            System.out.println("Data mahasiswa sebelum sorting = ");
            list.tampil();

            System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
            list.bubbleSort();
            list.tampil();

            System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
            list.selectionSort();
            list.tampil();
        }
    }
    ```
* ### Output Kode
    <img src = "./gambar/Percobaan 2.png">
* ### Pertanyaan
    1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()! 
    2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
    3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.
    4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case!   
* ### Jawaban

## 3. Percobaan 3: Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insection Sort
* ### Kode Program 1
    ```java
    public class Mahasiswa {
        String nama;
        int thnMasuk, umur;
        double ipk;

        Mahasiswa(String n, int t, int u, double i) {
            nama = n;
            thnMasuk = t;
            umur = u;
            ipk = i;
        }

        void tampil() {
            System.out.println("Nama = "+nama);
            System.out.println("Tahun Masuk = "+thnMasuk);
            System.out.println("Umur = "+umur);
            System.out.println("IPK = "+ipk);
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class DaftarMahasiswaBerprestasi {
        Mahasiswa listMhs[] = new Mahasiswa[5];
        int idx;

        void tambah(Mahasiswa m) {
            if (idx < listMhs.length) {
                listMhs[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!!");
            }
        }

        void tampil() {
            for (Mahasiswa m : listMhs) {
                m.tampil();
                System.out.println("-----------------------");
            }
        }

        void bubbleSort() {
            for (int i = 0; i < listMhs.length - 1; i++) {
                for (int j = 1; j < listMhs.length - i; j++) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }

        void selectionSort() {
            for (int i = 0; i < listMhs.length - 1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < listMhs.length; j++) {
                    //if (listMhs[j].ipk > listMhs[idxMin].ipk) {}
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin = j;
                    }
                }
                Mahasiswa tmp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp;
            }
        }

        void insectionSort() {
            for (int i = 1; i < listMhs.length; i++) {
                Mahasiswa temp = listMhs[i];
                int j = i;
                //while (j < 0 && listMhs[j - 1].ipk > temp.ipk) {}
                    while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }

                listMhs[j] = temp;
            }
        }
    }
    ```
* ### Kode Program 3
    ```java
    public class Main {
        public static void main(String[] args) {
            DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();

            Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
            Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
            Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
            Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 35, 2);
            Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

            list.tambah(m1);
            list.tambah(m2);
            list.tambah(m3);
            list.tambah(m4);
            list.tambah(m5);

            System.out.println("Data mahasiswa sebelum sorting = ");
            list.tampil();

            System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
            list.bubbleSort();
            list.tampil();

            System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
            list.selectionSort();
            list.tampil();

            System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
            list.insectionSort();
            list.tampil();
        }
    }
    ```
* ### Output Kode
    <img src = "./gambar/Percobaan 3.png">
* ### Pertanyaan
    1. Mengapa terdapat formulasi return value berikut?Jelaskan!
    <img src = "./gambar/P3 no2.png">
    2. Kenapa dibutuhkan variable mid pada method TotalDC()? 
    3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!

* ### Jawaban
    
## 4. Latihan Praktikum
* ## Tugas
    * ### Kode Program 1
        ```java
        public class Hotel {
            String nama, kota;
            int harga;
            byte bintang;

            Hotel(String n, String k, int h, byte b) {
                nama = n;
                kota = k;
                harga = h;
                bintang = b;
            }

            void tampil() {
                System.out.println("Nama = "+nama);
                System.out.println("Kota = "+kota);
                System.out.println("Harga = "+harga);
                System.out.println("Bintang = "+bintang);
            }
        }
        ```
    * ### Kode Program 2
        ```java
        public class HotelService {
            Hotel rooms[] = new Hotel[5];
            int idx;

            void tambah(Hotel H) {
                if (idx < rooms.length) {
                    rooms[idx] = H;
                    idx++;
                } else {
                    System.out.println("Data sudah penuh!!");
                }
            }

            void tampil() {
                for (Hotel H : rooms) {
                    H.tampil();
                    System.out.println("-----------------------");
                }
            }

            void bubbleSortHarga() {
                for (int i = 0; i < rooms.length - 1; i++) {
                    for (int j = 1; j < rooms.length - i; j++) {
                        if (rooms[j].harga > rooms[j - 1].harga) {
                            Hotel tmp = rooms[j];
                            rooms[j] = rooms[j - 1];
                            rooms[j - 1] = tmp;
                        }
                    }
                }
            }

            void selectionSortHarga() {
                for (int i = 0; i < rooms.length - 1; i++) {
                    int idxMin = i;
                    for (int j = i + 1; j < rooms.length; j++) {
                        if (rooms[j].harga < rooms[idxMin].harga) {
                            idxMin = j;
                        }
                    }
                    Hotel tmp = rooms[idxMin];
                    rooms[idxMin] = rooms[i];
                    rooms[i] = tmp;
                }
            }

            void bubbleSortBintang() {
                for (int i = 0; i < rooms.length - 1; i++) {
                    for (int j = 1; j < rooms.length - i; j++) {
                        if (rooms[j].bintang > rooms[j - 1].bintang) {
                            Hotel tmp = rooms[j];
                            rooms[j] = rooms[j - 1];
                            rooms[j - 1] = tmp;
                        }
                    }
                }
            }

            void selectionSortBintang() {
                for (int i = 0; i < rooms.length - 1; i++) {
                    int idxMax = i;
                    for (int j = i + 1; j < rooms.length; j++) { 
                        if (rooms[j].bintang < rooms[idxMax].bintang) {
                            idxMax = j;
                        }
                    }
                    Hotel tmp = rooms[idxMax];
                    rooms[idxMax] = rooms[i];
                    rooms[i] = tmp;
                }
            }
        }
        ```
    * ### Kode Program 3
        ```java
        public class Main {
            public static void main(String[] args) {
                HotelService list = new HotelService();

                Hotel H1 = new Hotel("The Singhasari", "Batu", 650250, (byte)5);
                Hotel H2 = new Hotel("Gets Hotel", "Malang", 350000, (byte)4);
                Hotel H3 = new Hotel("Ijen Suites", "Malang", 484330, (byte)5);
                Hotel H4 = new Hotel("Favehotel MEX", "Surabaya", 327520, (byte)4);
                Hotel H5 = new Hotel("Grand Surabaya", "Surabaya", 286663, (byte)3);

                list.tambah(H1);
                list.tambah(H2);
                list.tambah(H3);
                list.tambah(H4);
                list.tambah(H5);

                System.out.println("Data Hotel Sebelum Sorting");
                list.tampil();

                System.out.println("\nData Hotel Setelah Sorting Desc Berdasarkan Harga");
                list.bubbleSortHarga();
                list.tampil();

                System.out.println("\nData Hotel Setelah Sorting Asc Berdasarkan Harga");
                list.selectionSortHarga();
                list.tampil();
                
                System.out.println("\nData Hotel Setelah Sorting Desc Berdasarkan Bintang");
                list.bubbleSortBintang();
                list.tampil();

                System.out.println("\nData Hotel Setelah Sorting Asc Berdasarkan Bintang");
                list.selectionSortBintang();
                list.tampil();
            }
        }
        ```
    * ### Output Kode
        <img src = "./gambar/Tugas 2.png">