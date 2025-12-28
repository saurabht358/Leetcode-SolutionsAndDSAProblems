class Solution {
    // Function to find number of strongly connected components in the graph.
    Stack<Integer> stack ;
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        // code here
        stack = new Stack<>();
        int n = adj.size();
        boolean vis[] = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(adj,i,vis);
            }
        }
        
        
        ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjT.add(new ArrayList<>());
        }
        
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp = adj.get(i);
            for(int u:temp){
                adjT.get(u).add(i);
            }
        }
        int count = 0;
        Arrays.fill(vis,false);
        while(!stack.isEmpty()){
            int cur = stack.pop();
            if(!vis[cur]){
                count++;
                dfs2(adjT,cur,vis);
            }
        }
        
        return count;
        
        
        
        
    }
    void dfs(ArrayList<ArrayList<Integer>> adj,int node,boolean[] vis){
        
        vis[node] = true;
        for(int nei:adj.get(node)){
            if(!vis[nei]){
                dfs(adj,nei,vis);
            }
        }
        stack.push(node);
    }
    void dfs2(ArrayList<ArrayList<Integer>> adj,int node,boolean[] vis){
        
        vis[node] = true;
        for(int nei:adj.get(node)){
            if(!vis[nei]){
                dfs(adj,nei,vis);
            }
        }
         
    }
}
