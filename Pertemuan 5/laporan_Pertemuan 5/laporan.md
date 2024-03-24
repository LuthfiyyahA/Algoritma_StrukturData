<div align="center">
<h1> Laporan Praktikum Pertemuan 5</h1>
<img src = "./gambar/Logo Polinema.png">

<h3> NIM     : 2341720148 </h3>
<h3> Nama    : Luthfiyyah Adzka Nur Shabrina </h3> 
<h3> Kelas   : TI-1H</h3>
</div>

----
## 1. Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
* ### Kode Program 1
    ```java
    public class Faktorial{
        public int nilai;

        int faktorialBF(int n){
            int fakto = 1;
            for(int i = 1; i <= n; i++){
                fakto = fakto * i;
            }

            return fakto;
        }

        int faktorialDC(int n){
            if(n==1) {
                return 1;
            } else {
                int fakto = n * faktorialDC(n-1);
                return fakto;
            }
        }
    }
    ```
* ### Kode Program 2
    ```java
    import java.util.Scanner;

    public class FaktorialMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=============================================");
            System.out.print("Masukkan jumlah elemen yang akan dihitung : ");
            int iJml = sc.nextInt();

            Faktorial[] fk = new Faktorial[10];
            for (int i = 0; i < iJml; i++) {
                fk[i] = new Faktorial();
                System.out.print("Masukkan nilai data ke-" +(i+1)+ " : ");
                //int iNilai = sc.nextInt();
                fk[i].nilai = sc.nextInt();
            }

            System.out.println("HASIL - BRUTE FORCE");
            for (int i = 0; i < iJml; i++) {
                System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah "+fk[i].faktorialBF(fk[i].nilai));
            }

            System.out.println("HASIL - DIVIDE CONQUER");
            for (int i = 0; i < iJml; i++) {
                System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah "+fk[i].faktorialDC(fk[i].nilai));
            }
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
    
## 2. Percobaan 2: Menerima Input Isian Array Menggunakan Looping
* ### Kode Program 1
    ```java
    public class Pangkat {
        public int nilai, pangkat;

        int pangkatBF(int a, int n) {
            //int hasil = 0;
            int hasil = 1;
            for (int i = 0; i < n; i++) {
                hasil *= a;
            }

            return hasil;
        }

        int pangkatDC(int a, int n) {
            //if(n==1) {}
            if(n==0) {
                return 1;
            }else if (n%2==1) {
                return(pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
    ```
* ### Kode Program 2
    ```java
    import java.util.Scanner;
    public class PangkatMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=============================================");
            System.out.print("Masukkan jumlah elemen yang akan dihitung : ");
            int elemen = sc.nextInt();

            Pangkat[] png = new Pangkat[elemen];
            for (int i = 0; i < elemen; i++) {
                png[i] = new Pangkat();
                System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
                //int nilai = sc.nextInt();
                png[i].nilai = sc.nextInt();
                System.out.print("Masukkan nilai pangkat : ");
                //int pangkat = sc.nextInt();
                png[i].pangkat = sc.nextInt();
            }

            System.out.println("HASIL - BRUTE FORCE");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari " +png[i].nilai+ " pangkat " +png[i].pangkat+ " adalah " +png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }

            System.out.println("HASIL - DIVIDE CONQUER");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari " +png[i].nilai+ " pangkat " +png[i].pangkat+ " adalah " +png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
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

## 3. Percobaan 3: Penambahan Operasi Matematika di Dalam Method
* ### Kode Program 1
    ```java
    public class Sum {
        int elemen;
        double keuntungan[], total;

        Sum(int elemen) {
            this.elemen = elemen;
            this.keuntungan = new double[elemen];
            this.total = 0;
        }

        double totalBF(double arr[]) {
            for (int i = 0; i < elemen; i++) {
                total = total + arr[i];
            }

            return total;
        }

        double totalDC(double arr[], int l, int r) {
            if (l==r) {
                return arr[l];
            } else if (l<r) {
                //int mid = (l/r) + 2;
                int mid = (l+r) / 2;
                double lsum = totalDC(arr, l, mid-l);
                double rsum = totalDC(arr, mid+l, r);
                return lsum + rsum + arr[mid];
            }

            return 0;
        }
    }
    ```
* ### Kode Program 2
    ```java
    import java.util.Scanner;

    public class SumMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=============================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan jumlah jumlah bulan : ");
            int elm = sc.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("=============================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan untung bulan ke-" +(i+1)+ " = ");
                sm.keuntungan[i] = sc.nextDouble();
            }

            System.out.println("=============================================");
            System.out.print("Algoritma Brute Force");
            System.out.print("Total keuntungan perusahaan selama " +sm.elemen+ " bulan adalah " +sm.totalBF(sm.keuntungan));
            System.out.println("=============================================");
            System.out.print("Algoritma Divide Conquer");
            System.out.print("Total keuntungan perusahaan selama " +sm.elemen+ " bulan adalah " +sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
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
        public class Mobil {
            String merk, tipe;
            int tahun, top_acceleration, top_power;

            public Mobil(String mrk, String type, int thn, int top_acceleration, int top_power) {
                merk = mrk;
                tipe = type;
                tahun = thn;
                this.top_acceleration = top_acceleration;
                this.top_power = top_power;
            }
            
            int hitungMaxAcceleration(Mobil[] arr, int l, int r) {
                if (l==r) {
                    return arr[l].top_acceleration;
                }

                int mid = (l+r) / 2;
                int maxl = hitungMaxAcceleration(arr, l, mid);
                int maxr = hitungMaxAcceleration(arr, mid+1, r);
                return Math.max(maxl, maxr);
            }

            int hitungMinAcceleration(Mobil[] arr, int l, int r) {
                if (l==r) {
                    return arr[l].top_acceleration;
                }

                int mid = (l+r) / 2;
                int minl = hitungMinAcceleration(arr, l, mid);
                int minr = hitungMinAcceleration(arr, mid+1, r);
                return Math.min(minl, minr);
            }

            
            double hitungRata2Power(Mobil[] arr) {
                int totalPower = 0;

                for (Mobil mobil : arr) {
                    totalPower += mobil.top_power;
                }

                return (double) totalPower / arr.length;
            }
        }
        ```
    * ### Kode Program 2
        ```java
        public class MobilMain {
            public static void main(String[] args) {
                Mobil[] mobils = {
                    new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
                    new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
                    new Mobil("Nissan", "370Z", 2009, 4360, 657),
                    new Mobil("Subaru", "Brz", 2014, 4058, 609),
                    new Mobil("Subaru", "Imperza WRX STI", 2013, 6255, 703),
                    new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
                    new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
                    new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631)
                };

                Mobil mobilMain = new Mobil(null, null, 0, 0, 0);
                
                System.out.println("top_acceleration tertinggi adalah " +mobilMain.hitungMaxAcceleration(mobils, 0, mobils.length - 1));
                System.out.println("top_acceleration terendah adalah " +mobilMain.hitungMinAcceleration(mobils, 0, mobils.length - 1));
                System.out.println("Rata-rata top_power adalah " +mobilMain.hitungRata2Power(mobils));
            }
        }
        ```
    * ### Output Kode
        <img src = "./gambar/Tugas 2.png">