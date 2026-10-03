class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int max = 0;
        int dp[] = new int[n];
        for(int i=1;i<n;i++){
            int cnt = 0;
            if(s.charAt(i)=='(')continue;
            for(int j=i;j>=0;j--){
                if(s.charAt(j)=='(' && cnt < 1){
                    break;
                }
                if(s.charAt(j)==')'){
                    cnt++;
                }else{
                    cnt--;
                    if(cnt==0){
                        int prv = j>0?dp[j-1]:0;
                        dp[i] = prv+i-j+1;
                        max = Math.max(max,dp[i]);
                        
                        break;
                    }
                }

            }
        }
        return max;
    }
}
