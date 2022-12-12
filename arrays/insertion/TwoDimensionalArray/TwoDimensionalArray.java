package arrays.insertion.TwoDimensionalArray;

public class TwoDimensionalArray {
    int[][] arr;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int i = 0; i < numberOfRows; i++){
            for(int j = 0; j < numberOfColumns; j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValue(int row, int col, int valueToBeInserted){
        if(arr[row][col] == Integer.MIN_VALUE){
            arr[row][col] = valueToBeInserted;
        }
    }

    public void traverse(){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}