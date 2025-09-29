package recursion;

import java.util.ArrayList;
import java.util.List;

public class CountNumberOfSubSequencesWhoseSumIsK {

    /*
     * Time complexity=2^n
     * */

    public static void main(String[] args) {
        int[] arr={1,2,1};
        int i=0;
        int sum=0;
        int k=2;
        List<Integer> list1=new ArrayList<>();
        System.out.println(countSubsequencesWhoseSumIsK(i, list1, sum, arr, arr.length, k ));
    }

    private static int countSubsequencesWhoseSumIsK(int i, List<Integer> list1, int sum, int[] arr, int n, int k){
        if(i==n){
            if(sum==k) {
                return 1;
            }
            return 0;
        }
        list1.add(arr[i]);
        sum+=arr[i];
        int l=countSubsequencesWhoseSumIsK(i+1,list1,sum,arr,n,k);
        list1.remove(list1.size()-1);
        sum-=arr[i];
        int r=countSubsequencesWhoseSumIsK(i+1,list1,sum,arr,n,k);
        return l+r;

    }

}
