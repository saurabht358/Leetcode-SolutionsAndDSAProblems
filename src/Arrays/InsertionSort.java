package Arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int arr[]){

        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                arr[j] = key;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,6,5,0,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
