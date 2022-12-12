package recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(powerFunction(2, 2));
    }

    static int powerFunction(int base, int exp){
        if(exp < 0){
            return -1;
        }

        if(exp == 0){
            return 1;
        }

        return base * powerFunction(base, exp-1);
    }
}
 