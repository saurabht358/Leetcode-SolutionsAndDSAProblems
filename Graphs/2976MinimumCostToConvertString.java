class Solution {
    public long minimumCost(String source, String target, char[] ori, char[] cha, int[] cost) {
        int[][] adj = new int[26][26];
        int INF = (int) Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            Arrays.fill(adj[i],INF);
            adj[i][i] = 0;
        }

        int l = ori.length;
        for( int i=0;i<l;i++){
            int u = ori[i]-'a';
            int v = cha[i]-'a';

            if(adj[u][v] > cost[i]){
                adj[u][v] = cost[i];
            }

        }

        

        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                if(adj[i][k]==INF)continue;
                for(int j=0;j<26;j++){
                    if(adj[k][j]==INF)continue;
                    adj[i][j] = Math.min(adj[i][j],adj[i][k]+adj[k][j]);
                }
            }
        }

        long ans = 0;
        for(int i=0;i<source.length();i++){
            int schar = source.charAt(i)-'a';
            int ochar = target.charAt(i)-'a';
            if(schar!=ochar){
                if(adj[schar][ochar]== INF){
                    return -1;
                }else{
                    ans += adj[schar][ochar];
                }
            }
        }
        return ans;



    }
}
