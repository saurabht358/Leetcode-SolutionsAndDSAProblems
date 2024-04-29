import java.util.*;
class CyclicSort{
    public static void main(String[] args) {
        int arr[] = {3,7,5,9,6,2,1,4,8};
        System.out.println(Arrays.toString(arr));
        int i=0;
        while(i < arr.length){
            if(arr[i] != i+1){
                swap(arr,i,arr[i]-1);
            }else i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int []arr,int i,int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
