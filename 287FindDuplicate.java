class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(i<nums.length-1 && nums[i] != nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }else{
                if(nums[i] == nums[nums[i]-1] && i != nums[i]-1) return nums[i];
                i++;
            }
        }
        return nums.length-1;
    }
    void swap(int arr[],int i,int j){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
