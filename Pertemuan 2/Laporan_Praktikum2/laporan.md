<h1 style ="font-family: calibri ; text-align : center; "> Laporan Praktikum Pertemuan 2
<h1 style ="text-align : center; "><img src = "Logo Polinema.png">

<h3 style ="font-family: calibri ; text-align : center; "> NIM     : 2341720148  
<h3 style ="font-family: calibri ; text-align : center; "> Nama    : Luthfiyyah Adzka Nur Shabrina  
<h3 style ="font-family: calibri ; text-align : center; "> Kelas   : TI-1H

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