package recursion;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    /*
    * tim complexity==  N*logbase2^n
    * space complexity=O(N)
    * */

    public static void main(String[] args) {

        int[] arr={1,2,1,2,5,4,3,3,8,6,11,9};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    private static void mergeSort(int[] arr, int low,int high){
        if(low>=high)
            return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp=new ArrayList<>();
        int left =low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
                temp.add(arr[right]);
                right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }



    }
}
