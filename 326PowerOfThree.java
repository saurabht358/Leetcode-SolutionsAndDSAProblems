class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1 || n==3){
            return true;
        }
        return helper(n);
    }
    private boolean helper(int n){
        if(n==1 || n==3){
            return true;
        }
        if(n < 1) return false;
        if(n % 3 != 0) return false;
        
        return helper(n/3);
    }
}
