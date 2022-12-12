package arrays.project.rotateMatrix;
import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    static boolean rotateMatrix(int[][] matrix){
        if (matrix.length == 0 || matrix[0].length != matrix.length) return false;
        int n = matrix.length;
        for(int layer = 0; layer < n/2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];  
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top; 
            }
        }
        return true;
    }
}