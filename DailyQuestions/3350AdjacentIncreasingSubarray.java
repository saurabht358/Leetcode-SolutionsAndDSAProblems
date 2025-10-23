// counting #math
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int prev = 0,max=-1;
        int cur = 1,n=nums.size();
        for(int i=1;i<n;i++){
            if(nums.get(i-1) < nums.get(i)){
                cur++;
            }else{
                prev = cur;
                cur = 1;
            }

            max = Math.max(max, Math.max(Math.min(cur,prev),cur/2));
            
        }
        return max;
    }
}
