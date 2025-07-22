package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SolutionGraph {
}
class Solution {
    private int ansMax;
    class MaxC{
        char col;
        int freq;
        MaxC(char c,int f){
            col=c;
            freq=f;
        }
    }
    public int largestPathValue(String colors, int[][] edges) {
        ansMax = -1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n= colors.length();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList());
        }
        for(int[]edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }
        boolean visited[] = new boolean[n];
        if(isCyclic(adj))return -1;
        for(int i=0;i<n;i++){
            if(!visited[i])
                dfs(adj,i,new MaxC('0',-1),new int[26],colors,visited,new int[n][26]);
        }
        return ansMax;
    }
    private void dfs(ArrayList<ArrayList<Integer>> adj,int node,MaxC max,int[]freq,String colors,boolean[] vi,int[][]dp){
        char color = colors.charAt(node);
        if(vi[node]){
            freq[color-'a']++;
            copyAll(freq,dp[node],max);
            ansMax = Math.max(ansMax,max.freq);
            freq[color-'a']--;
            return;
        }
        vi[node] = true;
        freq[color-'a']++;
        if(max.freq<freq[color-'a']){
            max.col=color;
            max.freq = freq[color-'a'];
            ansMax = Math.max(ansMax,max.freq);
        }
        for(int nei:adj.get(node)){
            dfs(adj,nei,max,freq,colors,vi,dp);
        }
        if(max.col==color){
            freq[color-'a']--;
            MaxC temp = new MaxC('0',-1);
            for(char ch='a';ch<='z';ch+=1){
                if(freq[ch-'a']>temp.freq){
                    temp.freq = freq[ch-'a'];
                    temp.col = ch;
                }
            }
            max.freq = temp.freq;
            max.col = temp.col;
        }else{
            freq[color-'a']--;
        }
        // dp[node]
        for(int i=0;i<26;i++){
            dp[node][i]= freq[i];
        }

    }
    private void copyAll(int[] freq,int[] arr, MaxC max){
        int mx = -1;
        char mc = '0';
        int temp[] = new int[26];
        for(int i=0;i<26;i++){
            temp[i]=freq[i]+arr[i];
            if(temp[i]>mx){
                mx= temp[i];
                mc =(char) ('a'+i);
            }
        }
        max.freq = mx;
        max.col = mc;
    }
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
    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean []visited, int parent, Set<Integer> path){

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
