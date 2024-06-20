// Solution 1
class Solution {
    public void moveZeroes(int[] nums) {
        int pos= 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0) nums[pos++] = nums[j];

        }
        for(int i=pos;i<nums.length;i++){
            nums[i] =0;
        }
    }

    static void swap(int[] arr,int i,int j){
        if(j>=arr.length) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Solution 2
class Solution {
    public void moveZeroes(int[] nums) {
        int pos= nums.length-1;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]!=0) continue;
            int i=j+1;
            while(i<nums.length && nums[i]==0) i++;
            if(i>=nums.length) continue;
            swap(nums,j,i);
        }
    }

    static void swap(int[] arr,int i,int j){
        if(j>=arr.length) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
