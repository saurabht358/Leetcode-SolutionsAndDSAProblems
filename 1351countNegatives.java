
class Solution {
    public int countNegatives(int[][] grid) {
        int row=0,col=0,ans=0;
        for(row = 0;row< grid.length;row++){
            int l=0,h=grid[0].length -1;
            int neg=grid[0].length;
            while(l<=h){
                if(grid[row][0] < 0){ ans += grid[row].length; break;}
                if(grid[row][grid[0].length -1] >= 0){ break;}
                int mid=l+(h-l)/2;
                if(grid[row][mid] < 0){ neg = mid; h=mid-1;} 
                else if(grid[row][mid] >= 0) l=mid+1;
            }
            ans = ans + grid[0].length-neg;
        }
        return ans;
    }
}
