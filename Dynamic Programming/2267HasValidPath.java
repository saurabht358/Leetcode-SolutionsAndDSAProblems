class Solution {
    int max;
    int[][][] dp ;
    public boolean hasValidPath(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        if((m+n-1)%2==1)return false;
        if(m==n)return false;
        if(grid[0][0]==')' || grid[m-1][n-1]=='(')return false;
        max = (m+n-1)/2;

        dp = new int[m][n][max+1];

        return helper(grid,0,0,0)==2?true:false;
    }
    private int helper(char[][] g,int i,int j,int cnt){
        int m= g.length,n=g[0].length;
        if(i>=m || j>=n)return 1;
        if(i==m-1 && j==n-1){
            if(g[i][j]==')' && cnt==1)return 2;
            return 1;
        }

        if(dp[i][j][cnt]!=0)return dp[i][j][cnt];
        int prcnt = cnt;
        if(g[i][j]=='(')cnt = cnt+1;
        else cnt= cnt-1;
        if(cnt<0 || cnt >max){
            dp[i][j][prcnt]=1;
            return 1;
        }
        int down  = helper(g,i+1,j,cnt);
        if(down==2){
            dp[i][j][prcnt]=2;
            return 2;
        }
        dp[i][j][prcnt]= helper(g,i,j+1,cnt);
        return dp[i][j][prcnt];

    }
}
