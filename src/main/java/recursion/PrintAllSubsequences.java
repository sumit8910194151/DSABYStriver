package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

    /*
    * a contangeous/non-contangeous sequence which follows the oreder
    * arr={3,2,1}--> sub sequences-->{3},{1}.{2},{3,1}, {3,2}, {2,1},{3,2},{3,2,1}  non-subsequence-->{3,1,2}
    * we can follow take and not-take algorithm
    * */

    public static void main(String[] args) {
        int[] arr={3,1,2};
        List<Integer> list=new ArrayList<>();
        printSubseq(0, list, arr, arr.length);

    }

    private static void printSubseq(int i, List<Integer> list1, int arr[], int n){
        if(i==n){
            System.out.println(list1);
            return;}
        //take or pic the element
        list1.add(arr[i]);
        printSubseq(i+1,list1,arr,n);
        list1.remove(list1.size()-1);

        //do not take
        printSubseq(i+1,list1,arr,n);


    }



}
