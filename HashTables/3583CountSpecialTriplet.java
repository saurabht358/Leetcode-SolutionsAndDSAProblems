class Solution {
    public int specialTriplets(int[] nums) {
        int M = (int) 1e9+7;
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length,zero=0;
        long[]arr = new long[n];
        long result=0;
        for(int i=0;i<n;i++){
            int temp = nums[i]*2;
            arr[i] = map.getOrDefault(temp,0);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        map.clear();
        for(int i=n-1;i>=0;i--){
            int temp = nums[i]*2;
            result = (result + (arr[i]* map.getOrDefault(temp,0)) %M ) % M;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return (int)result;
 

    }
}
