public boolean isPowerOfFour(int n) {
        int countOne = 0;
        int countZero = 0;
        while(n>0){
            if((n&1)==1){
                countOne++;
            }else countZero++;
            n >>= 1;
        }
        if(countOne==1 && countZero%2==0) return true;
        return false;
    }
