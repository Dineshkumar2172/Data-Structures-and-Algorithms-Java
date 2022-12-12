package arrays.project;

import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arrayOuput = middle(arr);
        System.out.println(Arrays.toString(arrayOuput));
    }

    static int[] middle(int[] arr){
        int[] array = new int[arr.length-2];
        for(int i = 1; i < arr.length-1; i++){
            array[i-1] = arr[i];
        }
        return array;
    }
}