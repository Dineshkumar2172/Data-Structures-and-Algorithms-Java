package Searching.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,24,35,56,67,78,89,3,56,67};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 56){
                System.out.println(56 + " is found at the index " + i);
            }
        }
    }
}
  