class Solution {
    int p[];
    int components;
    int cables;
    public int makeConnected(int n, int[][] connections) {
        p = new int[n];
        components = n;
        cables = 0;
        for(int i=0;i<n;i++){
            p[i] = i;
        }
        for(int[] con:connections){
            union(con[0],con[1]);
        }
        if(components-1 <= cables)return components-1;
        return -1;

    }
    void union(int u,int v){
        int p1 = parent(u);
        int p2 = parent(v);
        if(p1==p2){
            cables++;
            return;
        }
        components--;
        p[p2] = p1;
    }
    int parent(int node){
        if(node == p[node])return node;
        p[node] = parent(p[node]);
        return p[node];
    }
}
