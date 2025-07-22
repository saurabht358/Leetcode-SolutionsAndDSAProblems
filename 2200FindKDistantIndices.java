class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> keys = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                keys.add(i);
            }
        }

        for(int i=0;i<n;i++){
            for(int ke:keys){
                if(Math.abs(ke-i)<=k){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
