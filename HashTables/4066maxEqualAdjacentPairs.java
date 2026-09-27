class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int n= nums.length;
        Map<String,Integer> map = new HashMap<>();
        int ans =0,max=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1])ans++;
            else{
                String key = nums[i]<nums[i+1]?nums[i]+"#"+nums[i+1] : nums[i+1]+"#"+nums[i];
                int val = map.getOrDefault(key,0)+1;
                map.put(key,val);
                if(val>max)max = val;
            }
        }
        return ans+max;


    }
}
