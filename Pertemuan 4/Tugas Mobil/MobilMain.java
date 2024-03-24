public class MobilMain {
    public static void main(String[] args) {
        Mobil[] mobils = {
            new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
            new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
            new Mobil("Nissan", "370Z", 2009, 4360, 657),
            new Mobil("Subaru", "Brz", 2014, 4058, 609),
            new Mobil("Subaru", "Imperza WRX STI", 2013, 6255, 703),
            new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
            new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        Mobil mobilMain = new Mobil(null, null, 0, 0, 0);
        
        System.out.println("top_acceleration tertinggi adalah " +mobilMain.hitungMaxAcceleration(mobils, 0, mobils.length - 1));
        System.out.println("top_acceleration terendah adalah " +mobilMain.hitungMinAcceleration(mobils, 0, mobils.length - 1));
        System.out.println("Rata-rata top_power adalah " +mobilMain.hitungRata2Power(mobils));
    }
}