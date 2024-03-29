<div align="center">
<h1> Laporan Praktikum Pertemuan 2</h1>
<img src = "./gambar/Logo Polinema.png">

<h3> NIM     : 2341720148 </h3>
<h3> Nama    : Luthfiyyah Adzka Nur Shabrina </h3> 
<h3> Kelas   : TI-1H</h3>
</div>

----
## 1. Percobaan 1: Deklarasi Class, Atribut dan Method
* ### Kode Program
    ```java
    public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga;

        void tampilInformasi() {
            System.out.println("Judul : " + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Jumlah Halaman : " + halaman);
            System.out.println("Sisa stok : " + stok);
            System.out.println("Harga : " + harga);
        }

        void terjual(int jml) {
            stok -= jml;
        }

        void restock(int jml) {
            stok += jml;
        }

        int gantiHarga(int hrg) {
        harga = hrg;
        return hrg;
        }
    }
    ```
* ### Output Kode
    <img src = "Percobaan 1.png">
* ### Pertanyaan
    1. Sebutkan dua karakteristik class atau object!
    2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!
    3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
    4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
    5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?  
* ### Jawaban
    1. Karakteristiknya yaitu :  
       • Memiliki variabel/atribut  
       • Bisa melakukan fungsi/method

    2. Atributnya :  
       • Ada 5  
       • Yaitu :  judul (String), pengarang(String), halaman(int), stok(int), harga(int)

    3. Methodnya :  
       • Ada 4  
       • Yaitu : 
       - tampilInformasi() : void
       - terjual(jml : int) : void
       - restock(jml : int) : void
       - gantiHarga(hrg : int) : int

    4. ```java
        public class Buku15 {
        String judul, pengarang;
        int halaman, stok, harga;

            void tampilInformasi() {
                System.out.println("Judul : " + judul);
                System.out.println("Pengarang : " + pengarang);
                System.out.println("Jumlah Halaman : " + halaman);
                System.out.println("Sisa stok : " + stok);
                System.out.println("Harga : " + harga);
            }

            void terjual(int jml) {
                if (stok > 0) {
                stok -= jml;
                }
            }

            void restock(int jml) {
                stok += jml;
            }

            int gantiHarga(int hrg) {
                harga = hrg;
                return hrg;
            }
        } 
        ```

    5. Parameter int digunakan untuk menambahkan jumlah stok buku sesuai dengan nilai yang diinputkan oleh pengguna, sedangkan jumlah stok buku harus berupa bilangan bulat positif yang tidak memiliki koma atau desimal
## 2. Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
* ### Kode Program
    ```java
    public class BukuMain15 {
        public static void main(String[] args) {
            Buku15 bk1 = new Buku15();
            bk1.judul = "Today Ends Tomorrow Comes";
            bk1.pengarang = "Denanda Pratiwi";
            bk1.halaman = 198;
            bk1.stok = 13;
            bk1.harga = 71000;

            bk1.tampilInformasi();
            bk1.terjual(5);
            bk1.gantiHarga(60000);
            bk1.tampilInformasi();
        }
    }
    ```
* ### Output Kode
    <img src = "Percobaan 2.png">
* ### Pertanyaan
    1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?  
    2. Bagaimana cara mengakses atribut dan method dari suatu objek?  
    3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?  
* ### Jawaban
    1. ```java
        Buku15 bk1 = new Buku15();
        ```

    2. Menggunakan operator titik (.) setelah nama objek, kemudian menuliskan nama atribut atau method yang ingin diakses

    3. Karena nilai atribut stok dan harga dari bk1 berubah setelah memanggil method terjual() dan gantiHarga(), method terjual() mengurangi stok sebanyak 5, sedangkan method gantiHarga() mengubah harga menjadi 60000
## 3. Percobaan 3: Membuat Konstruktor
* ### Kode Program 1
    ```java
    public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga;

        public Buku15() {

        }

        public Buku15(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }

        void tampilInformasi() {
            System.out.println("Judul : " + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Jumlah Halaman : " + halaman);
            System.out.println("Sisa stok : " + stok);
            System.out.println("Harga : " + harga);
        }

        void terjual(int jml) {
            if (stok < 0) {
            stok -= jml;
            }
        }

        void restock(int jml) {
            stok += jml;
        }

        int gantiHarga(int hrg) {
            harga = hrg;
            return hrg;
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class BukuMain15 {
        public static void main(String[] args) {
            Buku15 bk1 = new Buku15();
            bk1.judul = "Today Ends Tomorrow Comes";
            bk1.pengarang = "Denanda Pratiwi";
            bk1.halaman = 198;
            bk1.stok = 13;
            bk1.harga = 71000;

            bk1.tampilInformasi();
            bk1.terjual(5);
            bk1.gantiHarga(60000);
            bk1.tampilInformasi();

            Buku15 bk2 = new Buku15("Self Reward", "Maheera Ayesha", 160, 29, 59000);
            bk2.terjual(11);
            bk2.tampilInformasi();
        }
    }
    ```
* ### Output Kode
    <img src = "Percobaan 3.png">
* ### Pertanyaan
    1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
    2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?
    3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
    4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!
    5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku!
    6. Commit dan push kode program ke Github
* ### Jawaban
    1. ```java
        public Buku15(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
        ```
    2. Memanggil konstruktor berparameter dari class Buku15 dengan memberikan nilai “Self Reward” untuk judul, “Maheera Ayesha” untuk pengarang, 160 untuk halaman, 29 untuk stok, dan 59000 untuk harga kemudian menginisialisasi nilai atribut judul, pengarang, halaman, stok, dan harga dari objek bk2 sesuai dengan nilai parameter yang diberikan

    3. Hasilnya tetap, karena objek Buku15 masih bisa diinstansiasi  dengan menggunakan konstruktor berparameter. Konstruktor default digunakan jika ingin membuat objek tanpa memberikan nilai awal untuk atributnya

    4. Tidak, karena method di dalam class tidak berhubungan antara method satu dengan method lainnya, method hanya akan mengubah atau megisi sesuai dengan atribut ataupun parameter yang dimiliki

    5. 
## 4. Latihan Praktikum
* ## Tugas 1
    * ### Kode Program 
        ```java
        public class Buku15 {
        String judul, pengarang;
        int halaman, stok, harga;

            public Buku15() {

            }

            public Buku15(String jud, String pg, int hal, int stok, int har) {
                judul = jud;
                pengarang = pg;
                halaman = hal;
                this.stok = stok;
                harga = har;
            }

            void tampilInformasi() {
                System.out.println("Judul : " + judul);
                System.out.println("Pengarang : " + pengarang);
                System.out.println("Jumlah Halaman : " + halaman);
                System.out.println("Sisa stok : " + stok);
                System.out.println("Harga : " + harga);
            }

            void terjual(int jml) {
                if (stok < 0) {
                stok -= jml;
                }
            }

            void restock(int jml) {
                stok += jml;
            }

            int gantiHarga(int hrg) {
                harga = hrg;
                return hrg;
            }

            int hitungHargaTotal(){
                gantiHarga(harga);
                return gantiHarga(harga) * stok;
            }

            double hitungDiskon(int hargaTotal) {
                if (hargaTotal > 150000) {
                    return hargaTotal * 0.12;
                } else if (hargaTotal >= 75000) {
                    return hargaTotal * 0.05;
                } else {
                    return hargaTotal * 0.0;
                }
            }

            double hitungHargaBayar(int hargaTotal, double diskon) {
                return hargaTotal - diskon;
            }
        }
        ```
* ## Tugas 2
    * ### Kode Program 1
        ```java
        public class Dragon {
        int x, y, width, height;

            void moveLeft() {
                x -= 1;
                if (x < 0 || x > width) {
                    detectCollision(x, y);
                }
            }

            void moveRight() {
                x += 1;
                if (x < 0 || x > width) {
                    detectCollision(x, y);
                }
            }

            void moveUp() {
                y -= 1;
                if (y < 0 || y > height) {
                    detectCollision(x, y);
                }
            }

            void moveDown() {
                y += 1;
                if (y < 0 || y > height) {
                    detectCollision(x, y);
                }
            }

            void printPosition() {
                System.out.println("Dragon sedang berada di (x,y) : (" + x + ", " + y + ")");
            }

            void detectCollision(int x, int y) {
                System.out.println("Game Over");
            }
        }
        ```
    * ### Kode Program 2
        ```Java
        public class DragonMain {
            public static void main(String[] args) {
                Dragon naga = new Dragon();
                naga.x = 10;
                naga.y = 10;
                naga.width = 10;
                naga.height = 10;

                naga.printPosition();
                naga.moveLeft();
                naga.moveUp();
                naga.printPosition();
                naga.moveRight();
                naga.moveDown();
                naga.printPosition();
                naga.moveDown();
            }
        }
        ```
    * ### Output Kode
        <img src = "Tugas 2.png">