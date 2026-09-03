class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];
        for(int num:nums1)if(num<min)min=num;
        boolean isFirst = min%2==0;
        if(!isFirst)return true;
        for(int num:nums1){
            if(num%2==1)return false;
        }
        return true;

    }
    
}
