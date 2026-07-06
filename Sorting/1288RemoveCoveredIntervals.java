class Solution {
    public int removeCoveredIntervals(int[][] inter) {
        
        Arrays.sort(inter,(a,b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            return b[1]-a[1];
        });
        int n=inter.length;
        int j=1,i=0;
        int res = n;
        while(j<n){
            if(inter[i][0] <= inter[j][0] && inter[j][1] <= inter[i][1]){
                res--;
                j++;
            }else{
                i=j;
                j++;
            }
        }
        return res;
    }
}
