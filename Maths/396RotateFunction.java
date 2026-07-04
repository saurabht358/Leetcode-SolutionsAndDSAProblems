class Solution {
    public int maxRotateFunction(int[] nums) {
        long max = Integer.MIN_VALUE;
        int n  = nums.length;
        long sum = 0;
        long prv = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prv += i * nums[i];
        }
        max = Math.max(prv,max);
        for(int i=1;i<n;i++){
            int last = n-i;
            prv = prv + sum -( n * nums[last] );
            // System.out.println(prv);
            max = Math.max(max,prv);
        }
        return (int)max;

    }
}
