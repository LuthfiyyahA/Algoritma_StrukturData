public class Mobil {
    String merk, tipe;
    int tahun, top_acceleration, top_power;

    public Mobil(String mrk, String type, int thn, int top_acceleration, int top_power) {
        merk = mrk;
        tipe = type;
        tahun = thn;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }
    
    int hitungMaxAcceleration(Mobil[] arr, int l, int r) {
        if (l==r) {
            return arr[l].top_acceleration;
        }

        int mid = (l+r) / 2;
        int maxl = hitungMaxAcceleration(arr, l, mid);
        int maxr = hitungMaxAcceleration(arr, mid+1, r);
        return Math.max(maxl, maxr);
    }

    int hitungMinAcceleration(Mobil[] arr, int l, int r) {
        if (l==r) {
            return arr[l].top_acceleration;
        }

        int mid = (l+r) / 2;
        int minl = hitungMinAcceleration(arr, l, mid);
        int minr = hitungMinAcceleration(arr, mid+1, r);
        return Math.min(minl, minr);
    }

    
    double hitungRata2Power(Mobil[] arr) {
        int totalPower = 0;

        for (Mobil mobil : arr) {
            totalPower += mobil.top_power;
        }

        return (double) totalPower / arr.length;
    }
}