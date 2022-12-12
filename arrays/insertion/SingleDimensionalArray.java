package arrays.insertion;

public class SingleDimensionalArray {


    int[] arr;


    public SingleDimensionalArray(int arraySize){
        arr = new int[arraySize];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }


    public void insert(int location, int valueToBeInserted){
        // Time complexity - O(1)
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("array got updated with the new value at the required location");
            } else {
                System.out.println("The location is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please ensure your location is within the location");
        }
    }

    public void traverseArray(){
        // Time complexity - O(n)
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void searchElement(int valueToSearch){
        // Time complexity - O(n)
        // Space complexity - O(1)
        if(arr.length > 0){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == valueToSearch){
                    System.out.println("The value is found");
                    return;
                }
            }
            System.out.println("The value is not present in the list");
        } else {
            System.out.println("List is empty");
        }
    }

    public void deleteValue(int valueToDeleteIndex){
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("deleted value at index " + valueToDeleteIndex + " successfully.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that has provided is not in the range of array");
        }
    }

}
