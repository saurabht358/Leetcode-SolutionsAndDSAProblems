//  #array #counting
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int prev = 0;
        int cur = 1,n=nums.size();
        for(int i=1;i<n;i++){
            if(nums.get(i-1) < nums.get(i)){
                cur++;
            }else{
                prev = cur;
                cur = 1;
            }

            if((cur >= k && prev >= k  ) || cur >= k*2){
                return true;
            }
        }
        return false;
    }
}
