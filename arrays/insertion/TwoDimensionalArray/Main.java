package arrays.insertion.TwoDimensionalArray;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(5, 5);

        tda.insertValue(0, 0, 1);
        tda.traverse();
    }
}
