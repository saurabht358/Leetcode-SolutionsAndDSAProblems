class Solution {
    public int subtractProductAndSum(int n) {
        long sum=0,prod=1;
        int temp=n;
        if(n==0 || n==1) return 0;
        while(temp>0){
            int rem = temp % 10;
            sum +=rem;
            prod *=rem;
            temp/=10;
        }
        return (int) (prod-sum);
    }
}
