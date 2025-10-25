class Solution {
    public int nextBeautifulNumber(int n) {
        if(n==0)return 1;
        n++;
        while(true){
            if(isBeauty(n))return n;
            n++;
        }
        // return -1;
    }
    private boolean isBeauty(int n ){
        int [] f = new int[10];
        while(n!=0){
            int rem = n%10;
            if(rem==0 || f[rem] >= rem)return false;
            f[rem]++;
            n/=10;
        }
        for(int i=1;i<=9;i++){
            if(f[i]!=i && f[i]!=0)return false;
        }
        return true;
    }
}
