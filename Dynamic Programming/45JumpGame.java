class Solution {
    int[] dp;

    // recursion with memoisation
    int rec(int[] nums,int level){
        //base case
        int n =  nums.length;
        if(level==n-1)return 0;
        int min = n;

        if(dp[level]!=0)return dp[level];

        // choices
        for(int i=1;i<=nums[level];i++){
            if(level+i>=n)break;
            min = Math.min(min,rec(nums,level+i));
        }

        //combine and return
        dp[level] = min+1;
        return dp[level];
    }
    public int jump(int[] nums) {
        dp = new int[nums.length];

        // bottom up approach
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<=nums[i];j++){
                int cur = dp[i];
                if(i+j >= n)break;
                if(cur+1 < dp[i+j] ){
                    dp[i+j]  = cur+1;
                }
            }
        }
        return  dp[n-1];
    }
}
