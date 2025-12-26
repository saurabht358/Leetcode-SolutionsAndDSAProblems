class Solution {
    int[] parent;
    int[] size;
    public int[] findRedundantConnection(int[][] edges) {
        int nodes = edges.length;
        parent = new int[nodes+1];
        size = new int[nodes+1];
        for(int i=1;i<=nodes;i++){
            parent[i] = i;
            size[i] = 1;
        }
        for(int[]e:edges){
            if(!union(e[0],e[1]))return e;
        }
        return new int[]{-1,-1};

    }
    private boolean union(int u,int v){
        int p1 = parent(u);
        int p2 = parent(v);
        if(p1==p2)return false;

        if(size[p1] <= size[p2]){
            parent[p1] = p2;
            size[p2]+=size[p1];
        }else{
            parent[p2] = p1;
            size[p1] +=size[p2];
        }

        return true;
    }
    private int parent(int node){
        if(node==parent[node])return node;
        parent[node] = parent(parent[node]);
        return parent[node];
    }
}
