class Solution {
    int f[];
    public int longestBalanced(String s) {
        int n = s.length();
        f = new int[26];
        int max = 1;
         
        for(int i=n;i>1;i--){
            // int val = 1;
            Arrays.fill(f,0);
            for(int k=0;k<i;k++){
                int ind = s.charAt(k)-'a';
                f[ind]++;
                
            }
            if(isBalance(f))return i;
            for(int j=1;j+i<=n;j++){
                f[s.charAt(j-1)-'a']-=1;
                f[s.charAt(j+i-1)-'a']+=1;
                if(isBalance(f)) return i;
            }
            
            
        }
        return 1;
    }
    public boolean isBalance(int[] f){
        int val = 1;
        for(int a:f){
            if(a!=0){
                val = a;
                break;
            }
        }
        for(int a : f){
            if(a!=0 && a!=val)return false;
        }
        return true;
    }
}
