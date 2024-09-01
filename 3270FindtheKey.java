class Solution {
    public int generateKey(int num1, int num2, int num3) {
        
        int ans=0;
        for(int i=3;i>=0;i--){
            int exp = (int) Math.pow(10,i);
            int digit1 = (int)(num1/exp)%10;
            int digit2 = (int)(num2/exp)%10;
            int digit3 = (int)(num3/exp)%10;

            ans = ans *10 + Math.min(digit1,Math.min(digit2,digit3));
            
        }
        return ans;
    }
}
