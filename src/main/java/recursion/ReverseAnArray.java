package recursion;



public class ReverseAnArray {

    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        reverseArray(array1,0, array1.length);
        System.out.println(array1);
        for(int k=0;k<=array1.length-1;k++){
            System.out.print(array1[k]+" ");
        }

    }

    public static void reverseArray(int[] arr,int i, int n){
         if(i>=n/2)
             return;
         swap(i,n-i-1, arr);
         reverseArray(arr,i+1,n);
    }

    private static void swap(int i, int i1, int[] arr) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
