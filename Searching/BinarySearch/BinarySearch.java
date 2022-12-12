package Searching.BinarySearch;

import javax.management.modelmbean.ModelMBeanNotificationInfo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        binarySearch(arr, 20);
    }

    static void binarySearch(int[] arr, int searchValue){
        int start = 0;
        int end = arr.length - 1;
        int middle = (start+end)/2;

        while(arr[middle] != searchValue){
            if(searchValue < arr[middle]){
                end = middle-1;
            } else {
                start = middle + 1;
            }
            middle = (start+end)/2;
        }

        if(arr[middle] == searchValue){
            System.out.println(searchValue + " value is found at index " + middle);
        } else {
            System.out.println("values is not found");
        }
    }
}
