import Percobaan.Mahasiswa;

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

    public int FindSeqSearch(String cari) {
        //int posisi = 2;
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                //j = posisi;
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            //mid = (right) / 2;
            mid = (left + right) / 2;
            if (listBk[mid].kodeBuku.equals(cari)) {
                return (mid);
            } else if (listBk[mid].kodeBuku.compareTo(cari) < 0) {
                //return FindBinarySearch(cari, left, mid);
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                //return FindBinarySearch(cari, mid, right);
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(String x, int pos) {
        if (pos!= -1) {
            System.out.println("Data : "+ x +" ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data "+ x +" tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
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
    
    public Buku15 FindBuku(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }
        return listBk[posisi];
    }

    public void sort() {
        for (int i = 1; i < listBk.length; i++) {
            Buku15 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j].kodeBuku.compareTo(listBk[j - 1].kodeBuku) > 0) {
                listBk[j] = listBk[j - 1];
                j--;
            }

            listBk[j] = temp;
        }
    }
}
