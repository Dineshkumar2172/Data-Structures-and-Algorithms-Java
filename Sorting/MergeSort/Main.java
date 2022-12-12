package Sorting.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {112,1,2,4,46,57,34,23,68};
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr, 0, arr.length-1);
    }
}
