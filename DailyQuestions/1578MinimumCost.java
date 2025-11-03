class Solution {
    public int minCost(String col, int[] nt) {
        int ans =0;
        int i=0,n = col.length();
        while(i<n){
            int[] t = cal(i+1,col,nt,col.charAt(i));
            ans += t[1];
            i = t[0];
        }
        return ans;
    }
    private int[] cal(int i,String s,int[] nt,char ch){
        int sum =nt[i-1],max = sum;
        while(i<nt.length && s.charAt(i)==ch){
            sum+=nt[i];
            max = Math.max(nt[i],max);
            i++;
        }
        return new int[]{i,sum-max};
    }
}
