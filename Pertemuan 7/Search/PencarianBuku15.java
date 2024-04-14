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

    public int FindSeqSearch(int cari) {
        //int posisi = 2;
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku==cari) {
                //j = posisi;
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            //mid = (right) / 2;
            mid = (left + right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                //return FindBinarySearch(cari, left, mid);
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                //return FindBinarySearch(cari, mid, right);
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos!= -1) {
            System.out.println("Data : "+ x +" ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data "+ x +" tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
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
    
    public Buku15 FindBuku(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku==cari) {
                posisi = i;
                break;
            }
        }
        return listBk[posisi];
    }
}
