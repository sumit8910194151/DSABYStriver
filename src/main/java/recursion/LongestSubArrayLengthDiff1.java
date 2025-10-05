package recursion;

import java.util.*;

import static java.lang.Math.abs;

public class LongestSubArrayLengthDiff1 {

    public static void main(String[] args) {
        int[] arr={4,6,5,3,3,1};
        List<Integer> list=new ArrayList<>();
        Set<Integer> list1=new HashSet<>();
        printSubseq(0, list, arr, arr.length, list1);
        int max=list1.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max);



    }

    private static void printSubseq(int i, List<Integer> list1, int arr[], int n, Set<Integer> list2){
        if(i==n){
            list2.add(list1.size());
            return ;}
        //take or pic the element
        if(diffFunction(list1,arr[i])) {
            list1.add(arr[i]);
            printSubseq(i + 1, list1, arr, n, list2);
            list1.remove(list1.size() - 1);}

        //do not take
        printSubseq(i + 1, list1, arr, n, list2);

    }


    private static boolean diffFunction(List<Integer> list1,int a){
        return list1.stream().noneMatch(e->abs(e-a)>1);


    }


}
