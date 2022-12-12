package recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsFunction(111));
    }
    static int sumOfDigitsFunction(int n){
        if(n==0 || n < 0){
            return 0;
        }
        return n%10 + sumOfDigitsFunction(n/10);
    }
}
