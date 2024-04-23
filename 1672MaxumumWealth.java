class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int []cust:accounts){
            int total =0;
            for(int wealth:cust){
                total+=wealth;
            }
            if(total>ans) ans=total;
        }
        return ans;
    }
}
