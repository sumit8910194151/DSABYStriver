package recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("factorial of 3 is: "+factorialOfN(3));

    }

    public static int factorialOfN(int n){
        if(n==0)
            return 1;
        else
            return n*factorialOfN(n-1);
    }
}
