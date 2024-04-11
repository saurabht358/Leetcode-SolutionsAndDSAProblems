class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null) return new int[]{-1,-1};
        int first= searchFirst(nums,target);
        int last= searchLast(nums,target);
        return new int[]{first,last};
    }
    public int searchFirst(int []arr,int target){
        int l=0,h=arr.length-1,index=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                index = mid;
                h=mid-1;
            }else if(arr[mid]<target) l=mid+1;
            else h=mid-1;
        }
        return index;
    }
    public int searchLast(int []arr,int target){
        int l=0,h=arr.length-1,index=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                index = mid;
                l=mid+1;
            }else if(arr[mid]<target) l=mid+1;
            else h=mid-1;
        }
        return index;
    }    
}
