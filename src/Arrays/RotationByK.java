package Arrays;

import java.util.Arrays;

public class RotationByK {
    public static int[]  rotate(int []arr,int k){
        int[]ans = new int[arr.length];
        int n = arr.length;
        int j= n-k;
        for (int i = 0; i < n;i++) {
            ans[i] = arr[j];
            j = (j+1)%n;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,6,5,0,2};
        System.out.println(Arrays.toString(rotate(arr,4)));
    }
}
