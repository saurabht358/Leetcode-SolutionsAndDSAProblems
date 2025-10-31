class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int i = 0,cnt = 0,k=0;
        int[]f = new int[nums.length];
        for(int num:nums){
            f[num]++;
        }
        int ans[] = new int[2];
        while(cnt < 2 && i< nums.length){
            if(f[i] > 1){
                cnt++;
                ans[k] = i;
                k++;
            }
            i++;
        }
        return ans;
    }
}
