package Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            int j=i+1;
            int min = arr[i];
            int minI = i;
            while(j<n){
                if(arr[j]<min){
                    min = arr[j];
                    minI = j;
                }
                j++;
            }
            arr[minI] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,6,5,0,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
