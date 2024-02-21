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