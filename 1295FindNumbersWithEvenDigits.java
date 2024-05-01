class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int num:nums){
            if(num==0) continue;
            int count=0,temp= num;
            while(temp!=0){
                temp/=10;
                count++;
            }
            if(count%2==0) ans+=1;
        }
        return ans;
    }
}
