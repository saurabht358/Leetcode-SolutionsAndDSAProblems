package TCSNQT;

import java.util.Arrays;

public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,1,0,1,0,0};
        int cur = 0,high = arr.length-1,low=0;

        while(cur<high){
            if(arr[cur]==0){
                arr[low]= 0;
                low=low+1;
                cur++;
            }else if(arr[cur]==1){
                arr[cur] = arr[high];
                arr[high] = 1;
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
