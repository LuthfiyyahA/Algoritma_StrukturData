public class Bola {
    public double jariJari;
    
    void bola(double r) {
        jariJari = r;
    }

    double hitungLP() {
        return 4 * Math.PI * (jariJari * jariJari);
    }

    double hitungVolume() {
        return (4 * Math.PI * (jariJari * jariJari * jariJari)) / 3;
    }
}
