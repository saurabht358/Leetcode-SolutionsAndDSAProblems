class Solution {
    public int minNumberOperations(int[] t) {
        int ans = 0;
        ans += t[0];
        int prev = t[0],i=1,n=t.length;
        while(i<n){
            if(prev < t[i]){
                ans+= t[i]-prev;
            }
            prev = t[i];
            i++;
        }
        return ans;

    }
}
