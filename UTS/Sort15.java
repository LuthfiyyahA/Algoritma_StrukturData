public class Sort15{
    Search15 listdata[] = new Search15[16];

    public void Sort(int[] data) {
            sorting(data, 0, data.length - 1);
    }
    
    public void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length];

        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }

        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i < s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sorting(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sorting(data, left, middle);
            sorting(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listdata.length; j++) {
            if (listdata[j].data==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listdata[mid].data) {
                return (mid);
            } else if (listdata[mid].data > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
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
    
    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"  ");
        }

        System.out.println();
    }
}