class Solution {
    public int numSteps(String s) {
        int carry = 0;
        int n=s.length();
        int i=n-1;
        int step =0;
        if(n==1){
            return 0;
        }
        for(;i>0;i--){
            int val = s.charAt(i)-'0';
            val += carry;
            if(val==2){
                carry = 1;
                step++;
            }else if(val==1){
                carry = 1;
                step+=2;
            }else{
                step++;
                carry =0;
            }
        }
        if(carry==1){
            return step+1;
        }
        return step;
    }
}
