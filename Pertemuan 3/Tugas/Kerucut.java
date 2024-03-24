public class Kerucut {
    public double jariJari;
    public double sisiMiring;

    void kerucut(double r, double sm) {
        jariJari = r;
        sisiMiring = sm;
    }

    double hitungLP() {
        return Math.PI * jariJari * (sisiMiring + jariJari);
    }

    double hitungVolume() {
        return Math.PI * jariJari * jariJari * Math.sqrt((sisiMiring * sisiMiring) - (jariJari * jariJari)) / 3;
    }
}
