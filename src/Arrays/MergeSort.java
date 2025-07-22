package Arrays;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int []arr){
        sort(arr,0, arr.length-1);
    }
    public static void sort(int []arr,int l,int h){
        if(l==h){
            return;
        }
        int mid = l + (h-l)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,h);
        merge(arr,l,h,mid);
    }
    public static void merge(int[] arr,int l,int h,int mid){
        int k = 0;
        int mer[] = new int[h-l+1];
        int i=l,j=mid+1;
        while(i<=mid && j<=h){
            if(arr[i]<=arr[j]){
                mer[k++] = arr[i++];
            }else{
                mer[k++] = arr[j++];
            }
        }
        while(i<=mid){
            mer[k++] = arr[i++];
        }
        while(j<=h){
            mer[k++] = arr[j++];
        }
        for(i=0;i<mer.length;i++){
            arr[l+i] = mer[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,6,5,0,2,-2,-9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
