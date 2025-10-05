// #math #xor
class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0,n=nums.length;
        boolean nonZ=false;
        for(int num:nums){
            if(num!=0)nonZ = true;
            total = total ^ num;
        }
        if(!nonZ)return 0;
        if(total !=0)return n;
        int k=0;
        return n-1;
    }
}
