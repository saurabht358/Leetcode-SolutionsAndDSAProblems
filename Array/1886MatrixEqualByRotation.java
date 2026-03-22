class Solution {
    public boolean findRotation(int[][] m, int[][] t) {
        int n =m.length;
         
        boolean flg = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(m[i][j]!=t[i][j]){
                    flg= false;
                    break;
                }
            }
            if(!flg)break;
        }
        if(flg)return true;
        // rotation 1-times
        flg = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(m[i][j]!=t[j][n-i-1]){
                    flg= false;
                    break;
                }
            }
            if(!flg)break;
        }
        if(flg){
            return true;
        }
        //rot-2
        flg = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( m[i][j] !=t[n-i-1][n-j-1]){
                    flg = false;
                    break;
                }
            }
            if(!flg)break;
        }
        if(flg){
            return true;
        }

        //rot-3
        flg = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(m[i][j]!=t[n-j-1][i]){
                    flg = false;
                    break;
                }
            }
            if(!flg)break;
        }
        if(flg){
            return true;
        }

        // if by rotating 3-times both can not same so, it impossible
        return false;
    }

    private boolean isEqual(int[][]m,int [][]t){
        int n=m.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(m[i][j]!=t[i][j])return false;
            }
        }
        return true;
    }
}
