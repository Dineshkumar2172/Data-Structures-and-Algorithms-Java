package bigONotation;

public class sumAndProduct {
    public static void main(String[] args) {
        int[] customeArrays = {1,2,3,4};
        spOfArrays(customeArrays);
    }

    static void spOfArrays(int[] array){
        int sum = 0;
        int product = 1;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        for(int i = 0; i < array.length; i++){
            product *= array[i];
        }
        System.out.println(sum + " " + product);
    }
}

// time complexity - O(n)