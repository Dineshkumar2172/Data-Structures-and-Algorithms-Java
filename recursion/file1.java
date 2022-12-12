package recursion;

class file1{
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    static int factorial(int n){
        System.out.println(n);
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
} 