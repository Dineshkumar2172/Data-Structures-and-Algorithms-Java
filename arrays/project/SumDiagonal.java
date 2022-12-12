package arrays.project;

public class SumDiagonal {
    public static void main(String[] args) {
        int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        int sum = sumDiagonal(myArray2D);
        if (sum != 0){
            System.out.println("The sum of diagonal values are : " + sum);
        }

    }

    static int sumDiagonal(int[][] arr){
        int sumDiagonalValues = 0;
        if (arr.length == arr[0].length){
            for(int i = 0; i < arr.length; i++){
                sumDiagonalValues += arr[i][i];
            }
            return sumDiagonalValues;
        }
        return 0;
    }
}
