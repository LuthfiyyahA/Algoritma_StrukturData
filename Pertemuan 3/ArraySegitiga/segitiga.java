public class segitiga {
    public int alas;
    public int tinggi;

    void Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    int hitungLuas() {
        return (alas * tinggi) / 2;
    }

    double hitungKeliling() {
        return alas + tinggi + Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
}