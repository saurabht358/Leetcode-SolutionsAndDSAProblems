class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int a:arr){
            sum+=a;
            if(sum>max)max = sum;
            if(sum < 0) sum=0;
            
        }
        return max;
    }
}
