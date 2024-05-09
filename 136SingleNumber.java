class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums); // First we will sort the array 
        int i=0;
        while(i<nums.length-1){ // traverse all elements from left to right -1;
            if(nums[i]!=nums[i+1]){   //check weather current and next elements are same if not then return current elements
                return nums[i];  
            }
            i+=2; // increments pointer by 2 because we know number can be repeated twice
        }
        if(i<nums.length){ 
            return nums[i];
        }else return nums[i-1];
    }
}
