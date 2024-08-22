class Solution {
    public int findComplement(int num) {
        int n= num;
        if(n==0 || n==1){
            return (1-n);
        }
        int base = 0;
        int sum = 0;
        while(n!=0){
            if((n&1)==0){
                sum +=(int) Math.pow(2,base);
            }
            base++;
            n = n/2;
        } 
        return sum;
    }
}
