
import java.util.*;
// MergeSort Using creating new copy of arrays;

public class Main
{
	public static void main(String[] args) {
		int arr[] = {45,15,12,8,5,3,-5};
	    arr = MergeSort(arr);
	    System.out.println(Arrays.toString(arr));
	}
	public static int[] MergeSort(int arr[]){
	    if(arr.length==1) return arr;
	    int[]arr1 ,arr2;
	    int mid= arr.length/2;
	    arr1= MergeSort(Arrays.copyOfRange(arr,0,mid));
	    arr2= MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
	    return merge(arr1,arr2);
	}
	static int[] merge(int [] arr1,int[] arr2){
	    int i=0,j=0,k=0;
	    int []ans = new int[arr1.length+arr2.length];
	    while(i<arr1.length && j<arr2.length){
	        if(arr1[i]<arr2[j]){
	            ans[k++] = arr1[i++];
	        }else ans[k++] = arr2[j++];
	    }
	    while(i<arr1.length) ans[k++]=arr1[i++];
        while(j<arr2.length) ans[k++]=arr2[j++];
        return ans;
	}

// MergeSort using index passing
public static void MSInPlace(int arr[],int s,int l){
	    if(l-s==1) return;
	     
	    int mid= (s+l)/2;
	    MSInPlace(arr,s,mid);
	    MSInPlace(arr,mid,l);
	    mergeInPlace(arr,s,mid,l);
	}
	static void mergeInPlace(int []arr,int s,int mid,int l){
	    int i=s,j=mid,k=0;
	    int []ans = new int[l-s];
	    while(i<mid && j<l){
	        if(arr[i]<arr[j]){
	            ans[k++] = arr[i++];
	        }else ans[k++] = arr[j++];
	    }
	    while(i<mid) ans[k++]=arr[i++];
        while(j<l) ans[k++]=arr[j++];
        for(int m=0;m<ans.length;m++){
            arr[s+m] = ans[m];
        }
	}
  
}
