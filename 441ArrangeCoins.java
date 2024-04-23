class Solution {
    public int arrangeCoins(int n) {
        long l =0l,temp=n,h=n;
        long k;
        if(n ==1) return 1;
        while(l<=h ){
            long mid= l +(h-l)/2;
            k = mid * (mid+1)/2;
            if(k == n) return (int)mid;
            else if(k<n) l = mid+1;
            else h = mid-1;
        }        
        return (int)h;
    }
}
