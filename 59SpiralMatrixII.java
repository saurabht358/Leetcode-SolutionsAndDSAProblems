class Solution {
    public int[][] generateMatrix(int n) {
        
        int lr = 0,ur = n-1;
        int lc = 0,uc = n-1;
        int [][]ans = new int[n][n];
        int num = 1;
        while(lr<=ur && lc<=uc){
            for(int i=lc;i<=uc;i++){
                ans[lr][i] = num;
                num++;
            }
            lr++;
            for(int i=lr;i<=ur;i++){
                ans[i][uc] = num;
                num++;
            }
            uc--;
            for(int i=uc;i>=lc;i--){
                ans[ur][i] = num;
                num++;
            }
            ur--;
            for(int i=ur;i>=lr;i--){
                ans[i][lc] = num;
                num++;
            }
            lc++;
        }
        return ans;
    }
}
