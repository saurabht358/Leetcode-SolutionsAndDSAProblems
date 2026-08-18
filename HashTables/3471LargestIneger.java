class Solution {
    public int largestInteger(int[] nums, int k) {
        int n= nums.length;
        if(n<k)return -1;
        // if(n==2 && k==2 && nums[0]==0 && nums[1]==0)return 0;

        if(n==k){
            int max = -1;
             
            for(int num:nums){
                 max =Math.max(num,max);
            }
             
            return max;
        }
        if(k==1){
            Set<Integer> set = new HashSet<>();
            Set<Integer> list = new HashSet<>();
            for(int i=0;i<n;i++){
                if(set.contains(nums[i])){
                    list.add(nums[i]);
                }else{
                    set.add(nums[i]);
                }
            }
            int max =-1;
            for(int num:nums){
                if(!list.contains(num))max=Math.max(max,num);
            }
            return max;
             
        }
        int a = nums[0],b=nums[n-1];
        int aa=0,bb=0;
        for(int i=0;i<n;i++){
            if(nums[i]==a)aa++;
            if(nums[i]==b)bb++;
        }
        int max = -1;
        if(aa==1)max = a;
        if(bb==1)max =Math.max(max,b);
        return max;
    }
}
