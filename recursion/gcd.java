package recursion;

public class gcd {
    public static void main(String[] args) {
        System.out.println(gcdFunction(8, 4));
    }

    static int gcdFunction(int a, int b){
        if(a<0 || b<0){
            return -1;
        }

        if(b == 0){
            return a; 
        }
         
        return gcdFunction(b, a%b);
    }
}
