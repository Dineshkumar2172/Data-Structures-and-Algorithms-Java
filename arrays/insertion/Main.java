package arrays.insertion;

public class Main {
    public static void main(String[] args) {
        SingleDimensionalArray sda = new SingleDimensionalArray(10);
        sda.insert(1, 21);
        sda.insert(2, 22);
        sda.insert(3, 23);

        System.out.println(sda.arr[0]); // I didn't assign any values to zeroth index. But default I programmed it to keep lowest integer
        System.out.println(sda.arr[1]);
        System.out.println(sda.arr[2]);
        System.out.println(sda.arr[3]);

        System.out.println("=========================================");
        sda.traverseArray();

        sda.searchElement(23);

        sda.deleteValue(2);
        System.out.println("=========================================");
        sda.traverseArray();
    }
}
