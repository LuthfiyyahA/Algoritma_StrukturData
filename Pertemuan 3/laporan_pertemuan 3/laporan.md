<h1 style ="font-family: calibri ; text-align : center; "> Laporan Praktikum Pertemuan 2
<h1 style ="text-align : center; "><img src = "Logo Polinema.png">

<h3 style ="font-family: calibri ; text-align : center; "> NIM     : 2341720148  
<h3 style ="font-family: calibri ; text-align : center; "> Nama    : Luthfiyyah Adzka Nur Shabrina  
<h3 style ="font-family: calibri ; text-align : center; "> Kelas   : TI-1H

----
## 1. Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
* ### Kode Program 1
    ```java
    public class PersegiPanjang {
    public int panjang;
    public int lebar;
    }
    ```
* ### Kode Program 2
    ```java
    public class ArrayObjects {
        public static void main(String[] args) {
            PersegiPanjang[] ppArray = new PersegiPanjang[3];

            ppArray[0] = new PersegiPanjang();
            ppArray[0].panjang = 110;
            ppArray[0].lebar = 30;

            ppArray[1] = new PersegiPanjang();
            ppArray[1].panjang = 80;
            ppArray[1].lebar = 40;

            ppArray[2] = new PersegiPanjang();
            ppArray[2].panjang = 100;
            ppArray[2].lebar = 20;
            
            System.out.println("Persegi  Panjang Ke-0, panjang : "+ppArray[0].panjang+", lebar : "+ppArray[0].lebar);
            System.out.println("Persegi  Panjang Ke-1, panjang : "+ppArray[1].panjang+", lebar : "+ppArray[1].lebar);
            System.out.println("Persegi  Panjang Ke-2, panjang : "+ppArray[2].panjang+", lebar : "+ppArray[2].lebar);
        } 
    }
    ```
* ### Output Kode
    <img src = "Percobaan 1.png">
* ### Pertanyaan
    1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!
    2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
    <img src = "P1 no2.png">
    3. Apa yang dimaksud dengan kode berikut ini:
    <img src = "P1 no3.png">
    4. Apa yang dimaksud dengan kode berikut ini:
    <img src = "P1 no4.png">
    5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
* ### Jawaban
    
## 2. Percobaan 2: Menerima Input Isian Array Menggunakan Looping
* ### Kode Program 1
    ```java
    public class PersegiPanjang {
    public int panjang;
    public int lebar;
    }
    ```
* ### Kode Program 2
    ```java
    import java.util.Scanner;

    public class ArrayObjects {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            PersegiPanjang[] ppArray = new PersegiPanjang[3];
            
            for (int i = 0; i < 3; i++) {
                ppArray[i] = new PersegiPanjang();
                System.out.println("Persegi panjang ke-" + i);
                System.out.print("Masukkan panjang : ");
                ppArray [i].panjang = sc.nextInt();
                System.out.print("Masukkan lebar : ");
                ppArray [i].lebar = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Persegi Panjang Ke-"+ i);
                System.out.println("Panjang : "+ ppArray[i].panjang +", lebar : "+ ppArray[i].lebar);
            }
        } 
    }
    ```
* ### Output Kode
    <img src = "Percobaan 2.png">
* ### Pertanyaan
    1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
    2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
    3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?
    <img src = "P2 no3.png">
    4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
    5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !  
* ### Jawaban

## 3. Percobaan 3: Penambahan Operasi Matematika di Dalam Method
* ### Kode Program 1
    ```java
    public class Balok {
        public int panjang;
        public int lebar;
        public int tinggi;

        public Balok(int p, int l, int t) {
            panjang = p;
            lebar = l;
            tinggi = t;
        }

        public int hitungVolume() {
            return panjang * lebar * tinggi;
        }
    }
    ```
* ### Kode Program 2
    ```java
    public class ArrayBalok {
        public static void main(String[] args) {
            Balok[] blArray = new Balok[3];

            blArray[0] = new Balok(100, 30, 12);
            blArray[1] = new Balok(120, 40, 15);
            blArray[2] = new Balok(210, 50, 25);

            for (int i = 0; i < 3; i++) {
                System.out.println("Volume balok ke-"+ i +" : "+ blArray[i].hitungVolume());
            }
        }
    }
    ```
* ### Output Kode
    <img src = "Percobaan 3.png">
* ### Pertanyaan
    1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
    2. Jika diketahui terdapat class Segitiga seperti berikut ini:
    <img src = "P3 no2.png">
    Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
    3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring)
    4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:
    <img src = "P3 no4.png">
    5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().

* ### Jawaban
    
## 4. Latihan Praktikum
* ## Tugas 1
    * ### Kode Program 
        ```java
        
        ```
    * ### Output Kode
        <img src = "Tugas 1.png">
* ## Tugas 2
    * ### Kode Program 1
        ```java
        public class Mhs {
            public String nama;
            public int nim;
            public char jK;
            public double ipk;
        }
        ```
    * ### Kode Program 2
        ```java
        import java.util.Scanner;

        public class MhsMain {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Mhs[] mahasiswa = new Mhs[3];

                for (int i = 0; i < 3; i++) {
                    mahasiswa[i] = new Mhs();

                    System.out.println("Masukkan data mahasiswa ke-"+ (i+1));
                    System.out.print("Masukkan nama          : ");
                    mahasiswa[i].nama = sc.nextLine();

                    System.out.print("Masukkan NIM           : ");
                    mahasiswa[i].nim = sc.nextInt();

                    System.out.print("Masukkan jenis kelamin : ");
                    mahasiswa[i].jK = sc.next().charAt(0);

                    System.out.print("Masukkan IPK           : ");
                    mahasiswa[i].ipk = sc.nextDouble();
                    sc.nextLine();
                }

                System.out.print("\n");
                
                for (int i = 0; i < 3; i++) {
                    System.out.println("Data mahasiswa Ke-"+ (i+1));
                    System.out.println("nama          : "+ mahasiswa[i].nama +"\nnim           : "+ mahasiswa[i].nim +"\nJenis kelamin : "+ mahasiswa[i].jK + "\nNilai IPK     : "+ mahasiswa[i].ipk);
                }
            }
        }
        ```
    * ### Output Kode
        <img src = "Tugas 2.png">
* ## Tugas 3
    * ### Kode Program 1
        ```java
        public class Mhs {
            public String nama;
            public int nim;
            public char jK;
            public double ipk;

            double hitungRataRata(Mhs[] mahasiswa) {
                double total = 0;
                for (int i = 0; i < 3; i++) {
                    total += mahasiswa[i].ipk;
                }
                return total / 3;
            }

            double cariIpkTerbesar(Mhs[] mahasiswa) {
                double besar = mahasiswa[0].ipk;
                for (int i = 0; i < 3; i++) {
                    if (mahasiswa[i].ipk > besar) {
                        besar = mahasiswa[i].ipk;
                    }
                }
                return besar;
            }
        }
        ```
    * ### Kode Program 2
        ```java
        import java.util.Scanner;

        public class MhsMain {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Mhs[] mahasiswa = new Mhs[3];

                for (int i = 0; i < 3; i++) {
                    mahasiswa[i] = new Mhs();

                    System.out.println("Masukkan data mahasiswa ke-"+ (i+1));
                    System.out.print("Masukkan nama          : ");
                    mahasiswa[i].nama = sc.nextLine();

                    System.out.print("Masukkan NIM           : ");
                    mahasiswa[i].nim = sc.nextInt();

                    System.out.print("Masukkan jenis kelamin : ");
                    mahasiswa[i].jK = sc.next().charAt(0);

                    System.out.print("Masukkan IPK           : ");
                    mahasiswa[i].ipk = sc.nextDouble();
                    sc.nextLine();
                }

                System.out.print("\n");
                
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------------");
                    System.out.println("Data mahasiswa Ke-"+ (i+1));
                    System.out.println("nama          : "+ mahasiswa[i].nama +"\nnim           : "+ mahasiswa[i].nim +"\nJenis kelamin : "+ mahasiswa[i].jK + "\nNilai IPK     : "+ mahasiswa[i].ipk);
                }

                System.out.print("\n");
                
                Mhs mhs = new Mhs();
                double rataRata = mhs.hitungRataRata(mahasiswa);
                System.out.println("----------------------------------------------");
                System.out.println("Rata-rata IPK mahasiswa adalah : " + rataRata);

                double ipkBesar = mhs.cariIpkTerbesar(mahasiswa);
                System.out.println("----------------------------------------------");
                System.out.println("IPK mahasiswa Terbesar adalah : " + ipkBesar);
                System.out.println("----------------------------------------------");

                sc.close();
            }
        } 
        ```
    * ### Output Kode
        <img src = "Tugas 31.png">
        <img src = "Tugas 32.png">