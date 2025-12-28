class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long ans = Integer.MIN_VALUE;
        int max[] = new int[n];
        int m = nums[n-1];
        int min = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){           
             min = Math.min(min,nums[i]);
            max[i] = min;
        }
        long cur =0;
        for(int i=0;i<n-1;i++){
            cur+=nums[i];
            long sco = cur-max[i+1];
            if(sco >ans ) ans = sco;
        }
         
        return ans;
    }
}
