package GraphsDSA;
import java.util.*;
public class TopoLogicalSort {
    static ArrayList<Integer> topoSortByKahn(List<List<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int v = adj.size();
        int indegree[] = new int[v];
        for(int i=0;i<v;i++){
            for(int nei:adj.get(i)){
                indegree[nei]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0) q.offer(i);
        }
        while (!q.isEmpty()){
            int cur = q.poll();
            ans.add(cur);
            for(int nei:adj.get(cur)){
                indegree[nei]--;
                if(indegree[nei]==0) q.offer(nei);
            }
        }
        return ans;
    }
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = adj.size();
        Stack<Integer> st = new Stack<>();
        boolean []visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(adj,st,i,visited);
            }
        }


        while(!st.isEmpty()){
            ans.add(st.pop());
        }

        return ans;


    }
    private static void dfs(ArrayList<ArrayList<Integer>> adj,Stack<Integer> st,int index,boolean []visited){
        if(visited[index]) return;
        visited[index] = true;
        for(int neighbours:adj.get(index)){
            dfs(adj,st,neighbours,visited);
        }
        st.push(index);
    }
}
