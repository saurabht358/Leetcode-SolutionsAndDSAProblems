import java.util.*;
public class Main
{   static int[] ans;
	public static void main(String[] args) {
		int arr[] = {45,15,12,5,3,-5};
	    QuickSort(arr,0,arr.length-1);
	    System.out.println(Arrays.toString(arr));
	}
	public static void QuickSort(int[] arr,int low,int high ){
	    if(low>=high) return;
	    int s=low,e=high,mid=low + (high-low)/2;
	    int pivot = arr[mid];
	    
	    while(s<=e){
	        while(arr[s]<pivot) s++;
	        while(arr[e]>pivot) e--;
	        if(s<=e){
	            swap(arr,s,e);
	            s++;e--;
	        }
	    }
	     
	    QuickSort(arr,low,e);
	    QuickSort(arr,s,high);
	}
	static void swap(int []arr,int i,int j){
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}
