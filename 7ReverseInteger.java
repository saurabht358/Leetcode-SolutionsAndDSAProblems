class Solution {
    public int reverse(int x) {
        if(x==0 || x==1) return x;
        boolean neg = x < 0 ? true: false;
        if(neg){
            x = -1 * x;
        }
        int temp = x;
        long ans=0;
        while(temp!=0){
            int rem = temp % 10;
            ans = ans * 10+ rem;
            temp/=10;
        }
        if(neg){
            ans = -1 * ans;
        }
        if(ans < -2147483648 || ans >  2147483647)
            return 0;
        
        return (int) ans;
    }
}
