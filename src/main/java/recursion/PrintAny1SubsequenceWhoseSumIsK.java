package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAny1SubsequenceWhoseSumIsK {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int i=0;
        int sum=0;
        int k=2;
        List<Integer> list1=new ArrayList<>();
        printAny1SubsequencesWhoseSumIsK(i, list1, sum, arr, arr.length, k );
    }

    private static boolean printAny1SubsequencesWhoseSumIsK(int i, List<Integer> list1, int sum, int[] arr, int n, int k){
        if(i==n){
            if(sum==k) {
                System.out.println(list1);
                return true;
            }
            else return false;
        }
        list1.add(arr[i]);
        sum+=arr[i];
        if(printAny1SubsequencesWhoseSumIsK(i+1,list1,sum,arr,n,k)==true){
            return true;
        }
        list1.remove(list1.size()-1);
        sum-=arr[i];
       if( printAny1SubsequencesWhoseSumIsK(i+1,list1,sum,arr,n,k)==true){
           return true;
       }
       return  false;

    }
}
