package LeetCodeProblems.DP;
import java.util.*;
public class PerfectSubsetSum {
    public static  void main(String[] args) {
        int nums[] = {5,2,3,10,6,8};
        int target = 10;
        int n = nums.length;

        int dp[][] = new int[n][target+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        System.out.println(helper(nums,target,n-1,dp));

    }
    private static int helper(int[] nums,int req,int index,int[][] dp ){
        if (index < 0 || req < 0) return 0;
        if(req == 0) return 1;
        if(dp[index][req]!=-1){

            return dp[index][req];
        }
        int peek = helper(nums,req-nums[index],index-1,dp);
        int nopeek = helper(nums,req,index-1,dp);
        dp[index][req] = peek + nopeek;
        return dp[index][req];
    }

}
