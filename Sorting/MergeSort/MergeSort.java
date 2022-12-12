package Sorting.MergeSort;

public class MergeSort {

    static void merge(int[] arr, int left, int middle, int right){
        int[] leftTmpArray = new int[middle-left+2];
        int[] rightTmpArray = new int[right-middle+1];
        for(int i = 0; i <= middle - left; i++){
            leftTmpArray[i] = arr[left+1];
        }
        for(int i = 0; i <= right - middle; i++){
            rightTmpArray[i] = arr[middle+1+i];
        }

        leftTmpArray[middle-left+1] = Integer.MAX_VALUE;
        rightTmpArray[right-middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for(int k = left; k <= right; k++){
            if(leftTmpArray[i] < rightTmpArray[j]){
                arr[k] = leftTmpArray[i];
            } else {
                arr[k] = rightTmpArray[j];
                j++;
            }
        }
    }

    public static void mergeSort(int[] array, int left, int right){
        if(right > left){
            int m = (left+right)/2;
            mergeSort(array, left, m);
            mergeSort(array, m+1, right);
            merge(array, left, m, right);
        }

        printArray(array);
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
