package recursion;

public class SumOfFirstNaturalNumbers {

    public static void main(String[] args) {

        System.out.println("sum of first 5 natural numbers: "+sumOfNaturals(5));

    }

    public static int sumOfNaturals(int n){
        if(n==0)
            return 0;
        else
            return n+sumOfNaturals(n-1);

    }
}
