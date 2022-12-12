package Sorting.BubbleSort;

// Time complexity - O(N^2)
// Space complexity - O(1)
 
public class BubbleSort {
    public void bubbleSort(int[] arr){
        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
