// #bfs #dfs #graph #dijestra
class Solution {
    int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
    public int swimInWater(int[][] grid) {

        int n = grid.length;
        Queue<int[]> q = new LinkedList<>();
        int[][] g = new int[n][n];
        for(int[] gg:g){
            Arrays.fill(gg,Integer.MAX_VALUE);
        }
        q.offer(new int[]{0,0,grid[0][0]});

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int i = cur[0];
            int j= cur[1];
            int cost = cur[2];
            if(g[i][j] <= cost)continue;
            g[i][j] = cost;
            for(int[] d:dir){
                int ii=i+d[0];
                int jj= j+d[1];
                if(ii >=0 && jj >=0 && ii<n && jj < n ){
                    int cc = Math.max(cost,grid[ii][jj]);
                    if(cc < g[ii][jj]){
                        q.offer(new int[]{ii,jj,cc});
                    }
                }
            }
        }

        return g[n-1][n-1];

    }
}
