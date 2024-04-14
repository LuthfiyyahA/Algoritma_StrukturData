public class MergeSortMain15 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20,100, 90};
        System.out.println("Sorting dengan Merge Sort");
        MergeSort15 mSort = new MergeSort15();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}