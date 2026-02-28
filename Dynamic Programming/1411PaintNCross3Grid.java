class Solution {
    long[][][][] dp;
     
    long ans = 0;
    int M = (int)1e9+7;
    int N;
    public int numOfWays(int n) {
        N = n;
        dp = new long[n][4][4][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    Arrays.fill(dp[i][j][k], -1);
                }
            }
        }
        long res = fill(0,0,0,0);
        return (int)res%M;
    }

    private long   fill(int idx,int x,int y,int z){
        if(idx==N){
            // ans = (ans+1)%M;
            return 1;
        }
        if(dp[idx][x][y][z] != -1){
            return dp[idx][x][y][z];
        }

        long sum = 0;
         
             
        for(int i=1;i<=3;i++){
            if(i==x)continue;
            for(int j=1;j<=3;j++){
                if(j==y)continue;
                if(i==j)continue;
                for(int l =1;l<=3;l++){
                    if(l==z)continue;
                    if(j==l)continue;
                    sum = (sum + fill(idx+1,i,j,l) ) %M;
                }
            }
        }
        
        dp[idx][x][y][z] = sum;
        return sum;
    }
}
