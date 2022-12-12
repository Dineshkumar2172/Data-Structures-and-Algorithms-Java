package bigONotation;

import javax.xml.transform.Source;

public class pairOfNumbers {
    public static void main(String[] args) {
        int[] customeArrays = {1,2,3,4};
        poNumbers(customeArrays);
    }

    static void poNumbers(int[] arrays){
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays.length; j++){
                System.out.println(arrays[i] + "" + arrays[j]);
            }
        }
    }
}


// time complexity - n^2