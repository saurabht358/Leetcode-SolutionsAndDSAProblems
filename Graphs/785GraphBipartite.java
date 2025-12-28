class Solution {
    public boolean isBipartite(int[][] graph) {
        int n= graph.length;
        int[] col = new int[n];
        Arrays.fill(col,-1);

        for(int i=0;i<n;i++){
            if(col[i]==-1){
                col[i] = 0;
                if(!dfs(graph,i,col,1)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean dfs(int[][] g,int node,int[] col ,int color){
        for(int nei:g[node]){
            if(col[nei]!=-1){
                if(col[nei]==1-color)return false;
            }else{
                col[nei] = color;
                if(!dfs(g,nei,col,1-color))return false;

            }
        }
        return true;

    }
}
