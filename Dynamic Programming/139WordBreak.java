class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n= s.length();
        boolean[] dp = new boolean[n];
        Set<String> set = new HashSet<>(wordDict);
        for(int j=0;j<n;j++){
            String temp = s.substring(0,j+1);
            if(set.contains(temp)){
                dp[j]=true;
            }else{
                for(int i=0;i<j;i++){
                    temp = s.substring(i+1,j+1);
                    if(dp[i] && set.contains(temp)){
                        dp[j] = true;
                        break;
                    }
                }
            }
        }
        return dp[n-1];

    }
       
}
