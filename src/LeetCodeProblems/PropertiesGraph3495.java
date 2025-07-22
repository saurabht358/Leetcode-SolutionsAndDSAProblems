package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class PropertiesGraph3495 {
    public int numberOfComponents(int[][] properties, int k) {
        int n = properties.length;
        ArrayList<HashSet<Integer>> arr = new ArrayList<HashSet<Integer>>(n);
        for (int i = 0; i < n; i++) {
            arr.add(new HashSet<>());
        }

        int max = -1;
        int m = properties[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr.get(i).add(properties[i][j]);
                max = Math.max(max, properties[i][j]);
            }
        }
        ArrayList<ArrayList<Integer>> adjList;
        adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        max++;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (findEdges(arr, i, j, k)) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int ans = 0;
        printList(adjList);
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans++;
                dfs(i, adjList, visited);
            }
        }
        return ans;


    }

    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        if (visited[node]) return;
        visited[node] = true;
        for (int i : adj.get(node)) {
            dfs(i, adj, visited);
        }
    }

    private boolean findEdges(ArrayList<HashSet<Integer>> arr, int i, int j, int k) {
        Set<Integer> set = new HashSet<>();

        for (int val : arr.get(i)) {
            if (arr.get(j).contains(val)) set.add(val);

        }
        return set.size() >= k;
    }
    public  void printList(ArrayList<ArrayList<Integer>> adjList){
        for(int i=0;i<adjList.size();i++){
            System.out.print(i+" -> ");
            System.out.println(adjList.get(i));
        }
    }
    public static void main(String[] args) {
        PropertiesGraph3495 propertiesGraph3495 = new PropertiesGraph3495();
        int[][] properites= {{1,2},{1,1},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(propertiesGraph3495.numberOfComponents(properites,1));
    }
}