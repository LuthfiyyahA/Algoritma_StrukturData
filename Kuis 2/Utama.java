import java.util.Scanner;
public class Utama {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Tambah Tim");
        System.out.println("2. Hitung Point");
        System.out.println("3. Print");
        System.out.println("4. Keluar");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Voli sll = new Voli();

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("=====================================");
                    System.out.println("Tim yang akan bertanding");
                    System.out.println("=====================================");
                    sll.addTim("Palembang Bank Sumsebabel");
                    sll.addTim("Jakarta Lavani Allo Bank Electric");
                    sll.addTim("Jakarta Bhayangkara Presisi");
                    sll.addTim("Jakarta Pertamina Pertamax");
                    sll.addTim("Jakarta Garuda Jaya");
                    sll.addTim("Jakarta STIN BIN");
                    sll.addTim("Kudus Sukun Badak");
                    System.out.println();
                    break;
            
                case 2:
                    System.out.println("=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Lavani Allo Bank Electric", "Jakarta Garuda Jaya", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Kudus Sukun Badak", "Jakarta STIN BIN", 0, 3);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Pertamina Pertamax", "Jakarta Garuda Jaya", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Bhayangkara Presisi", "Palembang Bank Sumsebabel", 1, 3);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Pertamina Pertamax", "Jakarta STIN BIN", 0, 3);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Lavani Allo Bank Electric", "Palembang Bank Sumsebabel", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Lavani Allo Bank Electric", "Jakarta STIN BIN", 0, 3);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Pertamina Pertamax", "Jakarta Bhayangkara Presisi", 1, 3);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Kudus Sukun Badak", "Jakarta Garuda Jaya", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta STIN BIN", "Palembang Bank Sumsebabel", 2, 3);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Lavani Allo Bank Electric", "Jakarta Bhayangkara Presisi", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Pertamina Pertamax", "Kudus Sukun Badak", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Bhayangkara Presisi", "Jakarta Garuda Jaya", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Pertamina Pertamax", "Palembang Bank Sumsebabel", 1, 3);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Bhayangkara Presisi", "Kudus Sukun Badak", 3, 1);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta STIN BIN", "Jakarta Garuda Jaya", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Lavani Allo Bank Electric", "Jakarta Pertamina Pertamax", 3, 1);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Palembang Bank Sumsebabel", "Kudus Sukun Badak", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Palembang Bank Sumsebabel", "Jakarta Garuda Jaya", 3, 0);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Lavani Allo Bank Electric", "Kudus Sukun Badak", 3, 1);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta STIN BIN", "Jakarta Bhayangkara Presisi", 3, 1);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Palembang Bank Sumsebabel", "Jakarta Lavani Allo Bank Electric", 3, 2);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Garuda Jaya", "Jakarta STIN BIN", 0, 3);
                    
                    System.out.println("\n=====================================");
                    System.out.println("Point Yang Di Dapat Pada Pertandingan");
                    System.out.println("=====================================");
                    sll.hitungPoint("Jakarta Bhayangkara Presisi", "Jakarta Pertamina Pertamax", 3, 0);

                    System.out.println();
                    break;
                
                case 3:
                    System.out.println("Hasil Akhir Dari Pertandingan");
                    System.out.println("=====================================");
                    sll.print();
                    break;
            }
        }

        while (pilih != 4);
    }
}