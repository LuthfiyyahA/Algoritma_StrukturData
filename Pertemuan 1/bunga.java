public class bunga {
    public static void main(String[] args) {
        int[][] stok = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};

        tampilkanPendapatan(stok);

        tampilkanStokRoyalGarden4(stok);
    }

    public static void tampilkanPendapatan(int[][] stok) {
        int[] harga = {75000, 50000, 60000, 10000};

        System.out.println("----------Pendapatan RoyalGarden----------");
        System.out.println("__________________________________________");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }

            System.out.printf("| %-20s %-1s : Rp.%-7s | \n", "Pendapatan RoyalGarden ", (i+1), pendapatan);
        }

        System.out.println("------------------------------------------");
    }

    public static void tampilkanStokRoyalGarden4(int[][] stok) {
        int[] pengurangan = {1, 2, 0, 5};
        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        System.out.print("\n");
        System.out.println("Stok di RoyalGarden 4 Setelah Adanya Bunga Mati");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int j = 0; j < stok[3].length; j++) {
            int stokBerkurang = stok[3][j] - pengurangan[j];
            System.out.printf("%-8s : %-2s - %-2s = %-2s \n", bunga[j], stok[3][j], pengurangan[j], stokBerkurang);
        }
    }
}