class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0; 
        // first find total sum of array
        for(int num:nums){
            sum +=num;
        } 
        int left=0; // sum of left elements
        for(int i=0;i<nums.length;i++){
            if(left == (sum-left-nums[i])){  // check left sum == right sum if both are equal then return that index
                return i;
            }
            left = left + nums[i];
        }
        return -1;
    }
}
