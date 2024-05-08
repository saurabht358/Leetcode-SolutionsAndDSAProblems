import java.util.Arrays;
class Solution {
    public String[] findRelativeRanks(int[] score) {
       int []temp = new int[score.length];
        int n= score.length;
        for(int i=0;i<n;i++){ // create a copy of array score
            temp[i] = score[i];
        }
        // System.out.println(Arrays.toString(temp));
        reverseSort(temp); // Sort that temp array in descending order
        // System.out.println(Arrays.toString(temp));
        String []ans = new String[n];
        for(int i=0;i<n;i++){
            int ind = BS(temp,score[i]) ; // find the index of element in sorted array
            // System.out.println(ind);
        
            if(ind < 3){ // if index is less than 3 check for which index and give medals according to them
                if(ind==0){
                    ans[i] = "Gold Medal";
                }else if(ind==1){
                    ans[i] = "Silver Medal";
                }else if(ind==2){
                    ans[i] = "Bronze Medal";
                }
            }else        // Other wise assign its position in sorted array(position = index + 1) 
                ans[i] =Integer.toString(ind+1); 
        }

         return ans;
    }
    static int BS(int []arr,int key){ // This is Binary search for searching an element in sorted array
        int l=0,h=arr.length-1;
        int mid=0;
        while(l<=h){
            mid=l+(h-l)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid] > key) l=mid+1;
            else h = mid-1;
        }
        return mid;
    }
    public static void reverseSort(int []arr) // This function sort the array using bubbleSort
    {
        for(int i=0;i<arr.length;i++){
            boolean isSorted = true;
            for(int j=0;j<arr.length-i-1;j++){
                
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
            
        }
    }      
    
}
