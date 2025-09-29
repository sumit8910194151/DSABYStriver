package recursion;

import java.util.Arrays;

public class QuickSort {

    /*
    * Time complexity=
    * Space complexity=
    *
    * */

    public static void main(String[] args) {

        int[] arr={1,2,1,2,5,4,3,3,8,6,11,9};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pIndex=partition(arr, low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(i<=j && arr[i]<=pivot){
                i++;
            }
            while(i<=j && arr[j]>pivot ){
                j--;
            }
            if(i<j){int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;}
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }

    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
