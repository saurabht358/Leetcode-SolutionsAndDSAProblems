class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE,index=-1;  
        int l=0,h=arr.length-1;

        while(l<=h){
            int mid= l+(h-l)/2;
            if (mid==arr.length-1) continue;
            if(arr[mid]>arr[mid+1]){
                if(arr[mid]>max){
                    max= arr[mid];
                    index = mid;
                }
                h= mid-1;
            }else{
                if(arr[mid]>max){
                    max= arr[mid];
                    index = mid;
                }
                l= mid+1;
            }
        }
        return index;
    }
}
