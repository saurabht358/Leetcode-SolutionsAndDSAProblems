class Solution {
    public int myAtoi(String s) {
        int i=0,n= s.length();
        if(s==null || n ==0) return 0;
        boolean isneg= false;
        while(i<n && s.charAt(i)==' ') i++;
        if(i<n && s.charAt(i)=='+') isneg = false;
        else if(i<n && s.charAt(i)=='-') isneg = true;
        else i--;
        i++;
        while(i< n && s.charAt(i)=='0' ) i++;
        long ans = 0;
        while(i< n){
            if(s.charAt(i) >'9' || s.charAt(i)<'0') break;
            ans = ans*10 +(int) ( s.charAt(i) -'0');
            if(ans > 2147483647 && !isneg){
                return (int) 2147483647;
            }
            if(ans-1 > 2147483647 && isneg){
                return (int) -2147483648;
            }
            i++;
        }
        if(ans > 2147483647 && !isneg){
            return (int) 2147483647;
        }
        if(ans-1 > 2147483647 && isneg){
            return (int) -2147483648;
        }if(isneg){
            ans = -1 * ans;
        }
        return (int)ans;
    }
}
