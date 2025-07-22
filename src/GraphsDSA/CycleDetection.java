package GraphsDSA;

import java.util.*;

public class CycleDetection {

    class Pair{
        int child;
        int parent;
        Pair(int x,int y){
            child = x;
            parent = y;
        }
    }
    public boolean isCycleBfs(ArrayList<ArrayList<Integer>> adj) {

        // Code here
        int n= adj.size();
        boolean []visited= new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(bfs(adj,i,visited)) return true;
            }
        }
        return false;

    }
    private boolean bfs(ArrayList<ArrayList<Integer>> adj,int start,boolean []visited){

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(start,-1));

        while(!q.isEmpty()){
            Pair pair = q.poll();
            int node = pair.child;
            int pa = pair.parent;
            if(visited[node])return true;
            visited[node]= true;
            for(int nei:adj.get(node)){
                if(nei==pa)continue;
                q.offer(new Pair(nei,node));
            }
        }
        return false;
    }
    public boolean isCycleDfs(ArrayList<ArrayList<Integer>> adj) {

        // Code here
        int n= adj.size();
        boolean []visited= new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(dfs(adj,i,visited,-1)) return true;
            }
        }
        return false;

    }
    private boolean dfs(ArrayList<ArrayList<Integer>> adj,int node,boolean []visited,int parent){

        if(visited[node]) return true;

        visited[node] = true;
        for(int nei:adj.get(node)){
            if(nei==parent)continue;
            if(dfs(adj,nei,visited,node)) return true;
        }

        return false;
    }


    /*Complete the function below*/


}
class Solution {
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {

        // Code here
        int n= adj.size();
        boolean []visited= new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(dfs(adj,i,visited,-1,new HashSet<>())) return true;
            }
        }
        return false;

    }
    private boolean dfs(ArrayList<ArrayList<Integer>> adj,int node,boolean []visited,int parent,Set<Integer> path){

        if(visited[node] && path.contains(node)) return true;

        visited[node] = true;
        path.add(node);
        for(int nei:adj.get(node)){

            if(dfs(adj,nei,visited,node,path)) return true;
        }
        path.remove(node);
        return false;
    }
}
