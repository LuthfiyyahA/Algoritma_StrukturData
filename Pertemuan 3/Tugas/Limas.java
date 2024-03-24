public class Limas {
    public double sisi;
    public double tinggi;

    void limas(double s, double t) {
        sisi = s;
        tinggi = t;
    }

    double hitungLP() {
        return (sisi * sisi) + ((sisi * tinggi) / 2);
    }

    double hitungVolume() {
        return (sisi * sisi * tinggi) / 3;
    }
}
