package Barang;
public class Gudang15 {
    Barang15[] tumpukan;
    int size;
    int top;

    public Gudang15(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang15[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang15 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public void ambilBarang() {
        if (!cekKosong()) {
            Barang15 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner : " + konversiDesimalKeBiner(delete.kode));
        } else {
            System.out.println("Tumpukan barang kosong");
            //return null;
        }
    }

    public Barang15 lihatBarangTeratas() {
        //if (!isEmpty()) {
        if (!cekKosong()) {
            Barang15 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("rincian tumpukan barang di Gudang : ");
            for (int i = top; i >= 0; i--) {
            //for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi15 stack = new StackKonversi15();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }

        return biner;
    }

    public Barang15 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang15 barangTerbawah = tumpukan[0];
            System.out.println("Barang teratas " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public int cariBarang(String cari) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].nama.equalsIgnoreCase(cari)) {
                System.out.printf("Barang %s terdapat pada posisi ke %d dalam tumpukan\n", tumpukan[i].nama, i + 1);
                return i;
            }
        }
        System.out.println("Barang tidak ditemukan");
        return -1;
    }
}