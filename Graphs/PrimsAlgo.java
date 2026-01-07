// # minimum spanning tree
class Solution {
    public int spanningTree(int V, int[][] edges) {
        
        // code here
        List<List<int[]>> adj = new ArrayList<>();
        for(int i =0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]e:edges){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
            adj.get(e[1]).add(new int[]{e[0],e[2]});
        }
        boolean vis[] = new boolean[V];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        
        // vis[0] = true;
        // for(int nei)
        int sum=0;
        pq.offer(new int[]{0,0});
        while(!pq.isEmpty()){
            int [] cur  = pq.poll();
            if(vis[cur[0]])continue;
            vis[cur[0]]= true;
            sum+= cur[1];
            for(int[] nei:adj.get(cur[0])){
                if(!vis[nei[0]]){
                    pq.offer(new int[]{nei[0],nei[1]});
                }
            }
        }
        return sum;
        
    }
}
