class Solution {
    public int[] runningSum(int[] nums) {
        int prevsum = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] += prevsum;
            prevsum = nums[i];
        }
        return nums;
    }
}
