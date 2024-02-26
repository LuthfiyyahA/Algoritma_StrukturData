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