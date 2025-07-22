package TCSNQT;

import java.util.*;
public class SHIFTZERO {
    public static void main(String[] args) {

        int[] arr = {2, 5, 0, 6, 0, 8, 4, 0, 7, 0};
        int i = 0;
        int j;
        for ( j=0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }
        while(i < arr.length){
            arr[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
