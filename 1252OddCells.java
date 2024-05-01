class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][]mat = new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<n;j++){
                mat[indices[i][0]][j]+=1;
            }
            for(int j=0;j<m;j++){
                mat[j][indices[i][1]]+=1;
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]%2 != 0 ) ans++;
                    
            }
        }
        return ans;
    }
}
