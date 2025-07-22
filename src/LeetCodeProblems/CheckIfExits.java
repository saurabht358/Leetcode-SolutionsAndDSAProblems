package LeetCodeProblems;

public class CheckIfExits {
    public static void main(String[] args) {

        int [] nums = {10,12,7,6,1,5,1};
        int n= nums.length,req=8;
        int dp[][] = new int[n][req+1];
        System.out.println(helper(nums,req,nums.length-1,dp));
    }
    private static boolean helper(int[] nums,int req,int index,int[][] dp ){
        if (index < 0) return false;
        if(dp[index][req]!=0){
            if(dp[index][req]==1) return true;
            return false;
        }
        if(nums[index] <= req){
            req-=nums[index];
            if(req == 0) return true;
            if(helper(nums,req,index-1,dp)){
                dp[index][req] = 1;
                return true;
            }
            req+=nums[index];
        }
        if(helper(nums,req,index-1,dp)){
            dp[index][req] = 1;
            return true;
        }
        dp[index][req] = -1;
        return false;
    }
}
