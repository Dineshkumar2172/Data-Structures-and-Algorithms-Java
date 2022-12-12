package recursion;

public class finbonacci {
    public static void main(String[] args) {
        System.out.println(finbonacci(4));
    }

    static int finbonacci(int n){
        if(n<0){
            return -1;
        }

        if(n==0 || n==1){
            return n;
        }

        return finbonacci(n-1) + finbonacci(n-2);
    }
}
