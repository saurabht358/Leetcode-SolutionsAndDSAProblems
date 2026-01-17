class Solution {
    public long largestSquareArea(int[][] btl, int[][] tpr) {
        long ans = 0;
        int  n= btl.length;
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){

                int btx = Math.max(btl[i][0],btl[j][0]);
                int bty = Math.max(btl[i][1],btl[j][1]);
                int tpx = Math.min(tpr[i][0],tpr[j][0]);
                int tpy = Math.min(tpr[i][1],tpr[j][1]);
                if(btx >= tpx || bty >=tpy)continue;
                long l = (long) Math.min(tpx-btx,tpy-bty);
                if(l*l > ans)ans = l*l;
            }
        }
        return ans;
    }
}
