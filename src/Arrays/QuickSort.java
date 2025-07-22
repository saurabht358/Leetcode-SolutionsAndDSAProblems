package Arrays;

import java.util.Arrays;

public class QuickSort {


    public static void sort(int []arr){
         sort(arr,0,arr.length-1);
    }

    public static void sort(int []arr,int l,int h){
        if(l>=h) return;
         int pos = findPosition(arr,l,h);
         sort(arr,l,pos-1);
         sort(arr,pos+1,h);
    }

    private static int findPosition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i=l+1,j=h;
        while(i<=j){
            while(i <= j && arr[i]<=pivot) i++;
            while(j >= i && arr[j]>=pivot)j--;

            if(i<j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[l] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,6,5,0,2,-2,-9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
