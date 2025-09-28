// #prefixsum , #array , #splitarray

class Solution {
    public long splitArray(int[] nums) {
        
        int n = nums.length;
        int inc = 0,dec=n-1;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1])break;
            inc = i;
        }
        for(int i=n-2;i>=0;i--){
            if(nums[i]<=nums[i+1])break;
            dec = i;
        }
        if(inc < dec-1)return -1;
        long []lsum  =new long[n],rsum = new long[n];
        int prev =0;
        lsum[0] = nums[0];
        for(int i=1;i<=inc;i++){
            lsum[i] = nums[i]+lsum[i-1];
        }
        rsum[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            rsum[i] = rsum[i+1] + nums[i];
        }
        long min = Long.MAX_VALUE;
        if(inc>0)
        min = Math.abs(lsum[inc-1]-rsum[inc]);
        if(inc+1<n)
            return Math.min(min ,Math.abs(lsum[inc]-rsum[inc+1]));
        return min;
    }
}
