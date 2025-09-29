package recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheCombinations {

    /*
    * find all the combination whose sum is k it can contains duplicates, in any order, contageous/non-contangeous
    * Time complexity=2^t*k
    *
    * */

    public static void main(String[] args) {

        int[] arr={2,3,6,7};

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        findCombinations(0,arr,7,result,ds);
        System.out.println(result);

    }

    private static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> result, List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                result.add(new ArrayList<>(ds));

            }
            return;

        }

        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(ind,arr,target-arr[ind], result,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1,arr,target,result,ds);

    }

}
