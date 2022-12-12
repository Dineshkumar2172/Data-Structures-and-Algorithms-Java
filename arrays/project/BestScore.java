package arrays.project;

import java.util.Arrays;


public class BestScore {
    public static void main(String[] args) {
        Integer[] arr = {12,12,23,34,452,3132,15,354,656,13};
        bestScore(arr);
    }

    static void bestScore(Integer[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
