class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for(int i=0;i+3<=n;i++){
            for(int j =i+1;j+2<=n;j++){
                int ind = bs(nums,nums[i]+nums[j],j+1,n-1);
                ans +=(ind-j);
            }
        }
        return ans;
    }
    private int bs(int[] nums,int val,int l,int h){
        if(l>h)return l-1;
        int mid = l+(h-l)/2;
        if(nums[mid] < val){
            return bs(nums,val,mid+1,h);
        }else return bs(nums,val,l,mid-1);
    }
}
