//Soulution 1
class Solution {
    int ans = 0;
    public int longestIncreasingPath(int[][] mat) {
        int m =mat.length;
        int n =mat[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]==0){
                    int t = dfs(i,j,dp,mat,-1);
                    ans = Math.max(t,ans);
                } 
            }
        }
        return ans;
    }
    private int dfs(int r,int c,int[][]dp,int [][]mat,int prev){
        int m = mat.length;
        int n = mat[0].length;
        if(r>=m || r<0 || c>=n || c<0)return 0;
        
        //less or equal to prev
        if(mat[r][c] <= prev)return 0;

        //greater than and we have ans in dp
        if(dp[r][c]!=0)return dp[r][c]+1;

        //choices
        int left = dfs(r,c-1,dp,mat,mat[r][c]);
        int right = dfs(r,c+1,dp,mat,mat[r][c]);
        int up = dfs(r-1,c,dp,mat,mat[r][c]);
        int down = dfs(r+1,c,dp,mat,mat[r][c]);

        dp[r][c] = Math.max(left,Math.max(right,Math.max(up,down)));
         
        return dp[r][c]+1;


    }
}

// Soulution 2
class Solution {
    int ans = 0;
    public int longestIncreasingPath(int[][] mat) {
        int m =mat.length;
        int n =mat[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]==0){
                    int t = dfs(i,j,dp,mat)+1;
                    ans = Math.max(t,ans);
                } 
            }
        }
        return ans;
    }
    private int dfs(int r,int c,int[][]dp,int [][]mat){
        int m = mat.length;
        int n = mat[0].length;
        
        
        
        

        //greater than and we have ans in dp
        if(dp[r][c]!=0)return dp[r][c];

        //choices
        int left = 0;
        if(c-1 >=0){
            if(mat[r][c] < mat[r][c-1]){
                left = dfs(r,c-1,dp,mat)+1;
            }
             
        }
        int right = 0;
        if(c+1 < n){
            if(mat[r][c] < mat[r][c+1]){
                right = dfs(r,c+1,dp,mat)+1;
            }
             
        }
        int up = 0;
        if(r-1 >=0){
            if(mat[r][c] < mat[r-1][c]){
                up = dfs(r-1,c,dp,mat)+1;
            }
             
        }
        int down = 0;
        if(r+1 <m){
            if(mat[r][c] < mat[r+1][c]){
                down = dfs(r+1,c,dp,mat)+1;
            }
             
        }

         

        dp[r][c] = Math.max(left,Math.max(right,Math.max(up,down)));
         
        return dp[r][c];


    }
}
