package bigONotation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] customeArrays = {1,2,3,4,5};
        System.out.println(reverseFunction(customeArrays));
    }

    static String reverseFunction(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            int other = array.length-i-1;
            array[i] = array[other];
            array[other] = temp;
        }
        return Arrays.toString(array);
    }
}


// time complexity - O(N) 
