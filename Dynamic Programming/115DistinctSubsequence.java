 
// Approach 1: Recursion
class Solution {
    int[][] dp;
    public int numDistinct(String s, String t) {
        int n= s.length(),m=t.length();
        dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++)Arrays.fill(dp[i],-1);
        return solve(s.toCharArray(),t.toCharArray(),0,0);
    }
    private int solve(char[] s,char []t,int j,int ind){
        int n= s.length;
        if(j==t.length-1){
            int sum =0;
            for(int ii=ind;ii<n;ii++){
                if(s[ii]==t[j])sum++;
            }
            return sum;
        }
        if(dp[ind][j] != -1)return dp[ind][j];
        int res = 0;
        for(int ii=ind;ii<n;ii++){
            if(s[ii]==t[j]){
                res+= solve(s,t,j+1,ii+1);
            }
        }
        dp[ind][j] = res;
        return res;
    }
}





  // Approach 2: Bottom-up 
class Solution{
    int[][] dp;
    public int numDistinct(String ss, String tt) {
        int n= ss.length(),m=tt.length();
        dp = new int[n+1][m+1];
        char[] s= ss.toCharArray();
        char []t=tt.toCharArray();
        for(int i=n-1;i>=0;i--){
            if(s[i]==t[m-1])dp[i][m-1]=1+dp[i+1][m-1];
            else dp[i][m-1] = dp[i+1][m-1];
        }
        for(int j=m-2;j>=0;j--){
            for(int i=n-1;i>=0;i--){
                if(s[i]==t[j]){
                    dp[i][j] = dp[i+1][j] + dp[i+1][j+1];
                }else{
                    dp[i][j] = dp[i+1][j];
                }
            }
        }
        // int cnt = 0;
        // for(int i=1;i<=n;i++)cnt+=dp[i][m];
        return dp[0][0];
         
    }

     
}
