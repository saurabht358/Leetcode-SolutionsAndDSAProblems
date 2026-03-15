class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int dp[][] = new int[32][n+1];
        for(int num:arr){
            int bits = Integer.bitCount(num);
            dp[bits][dp[bits][n]] = num;
            dp[bits][n]++;
        }
        int [] ans = new int[arr.length];
        int k=0;
        for(int i=0;i<32;i++ ){
            int len = dp[i][n];
            if(len==0)continue;
            Arrays.sort(dp[i],0,len);
            for(int j=0;j<len;j++){
                ans[k++] = dp[i][j];
            }
        }
        return ans;
    }
}
