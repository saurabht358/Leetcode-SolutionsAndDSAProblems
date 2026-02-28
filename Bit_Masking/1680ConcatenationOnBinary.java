class Solution {
    int M = (int) 1e9+7;
    public int concatenatedBinary(int n) {
        long ans = 0;
        long base = 1;
        for(int num=1;num<=n;num++){
            int l=32 - Integer.numberOfLeadingZeros(num);
                ans = (ans<<l)%M;
                ans = (ans+num)%M;
            

        }
        return (int)ans%M;
    }
}
