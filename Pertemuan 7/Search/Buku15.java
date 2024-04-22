public class Buku15 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;
    Buku15 listBk[] = new Buku15[5];
    int idx;

    public Buku15(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang,int stock) {
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