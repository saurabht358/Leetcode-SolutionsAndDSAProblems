class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n= mat.length;
        int k= n-1;
        for(int i=0;i<n;i++){
            sum+= mat[i][i];
            sum+= mat[i][k--];
        }
        if(n%2==0) return sum;
        return sum-mat[n/2][n/2];
    }
}
