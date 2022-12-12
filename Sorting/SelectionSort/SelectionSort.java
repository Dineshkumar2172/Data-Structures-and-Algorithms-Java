package Sorting.SelectionSort;

// Time Complexity - O(N^2)
// Space Complexity - O(1)

public class SelectionSort {

    void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minimumIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minimumIndex]){
                    minimumIndex = j;
                }
            }

            if(minimumIndex != i){
                int temp = arr[i];
                arr[i] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }
        }

        printArray(arr);
    }

    void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}