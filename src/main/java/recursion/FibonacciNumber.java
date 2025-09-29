package recursion;

public class FibonacciNumber {
    public static void main(String[] args) {

        /*
        * Time complexity=2^n
        * space complexity=n
        * */

        System.out.println("3rd fibonacci number is: "+nthFibonacciNumber(3));

    }

    private static int nthFibonacciNumber(int n){

        if(n<=1)
            return n;
        int last=nthFibonacciNumber(n-1);
        int slast=nthFibonacciNumber(n-2);
        return last+slast;
    }

}
