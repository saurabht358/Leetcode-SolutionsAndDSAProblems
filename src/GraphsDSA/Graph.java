package GraphsDSA;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int[][] adjMat;
    int[] inDegree;
    int[] outDegree;
    int[] degree;
    class Pair{
        int d;
        int cost;
        Pair(int d,int cost){
            this.d = d;
            this.cost = cost;

        }
        public String toString(){
            return ( "("+d+","+cost+")" );
        }
    }
    List<List<Integer>> adjList;
    List<List<Pair>> adjListCost;
    Graph(int nodes){
        adjMat = new int[nodes][nodes];
        adjList = new ArrayList<>(nodes);
        for(int i=0;i<nodes;i++){
            adjList.add(new ArrayList<>(nodes));
        }
        adjListCost = new ArrayList<>(nodes);
        for(int i=0;i<nodes;i++){
            adjListCost.add(new ArrayList<>());
        }
        inDegree = new int[nodes];
        outDegree = new int[nodes];
        degree = new int[nodes];
    }

    public void printGraph(){
        for(int i=0;i< adjMat.length;i++){
            System.out.print("  "+i);
        }
        System.out.println();
        for(int i=0;i< adjMat.length;i++){
            System.out.print(i+" ");
            int[] row = adjMat[i];
            for(int node:row){
                System.out.print(node+" ");
            }
            System.out.println();
        }
    }
    public  void printList(){
        for(int i=0;i<adjList.size();i++){
            System.out.print(i+" -> ");
            System.out.println(adjList.get(i));
        }
    }
    public void printListCost(){
        for (int i = 0; i <adjListCost.size(); i++) {
            System.out.print(i+" -> ");
            System.out.print("[");
            for (Pair p:adjListCost.get(i)){
                System.out.print(p+",");
            }
            System.out.println("]");
        }
    }
    public void printDegreeDir(){
        for (int i = 0; i < inDegree.length; i++) {
            System.out.println(i+" -> "+inDegree[i]+","+outDegree[i]);
        }
    }
    public void printDegreeUnDir(){
        for (int i = 0; i < degree.length; i++) {
            System.out.println(i+" -> "+degree[i]);
        }
    }
    public void addEdgesList(int [][]edges,boolean isDirected){
        for(int[] edge:edges){
            int s = edge[0];
            int d = edge[1];
            if(isDirected){
                adjList.get(s).add(d);
            }else{
                adjList.get(s).add(d);
                adjList.get(d).add(s);
            }
        }
    }
    public void addEdgesListWithWeights(int[][] edges,boolean isDirected){
        for(int []edge:edges){
            int s = edge[0];
            int d = edge[1];
            int cost = edge[2];
            Pair pair = new Pair(d,cost);
            if(isDirected){
                adjListCost.get(s).add(pair);
            }else{
                adjListCost.get(s).add(pair);
                pair = new Pair(s,cost);
                adjListCost.get(d).add(pair);
            }
        }
    }
    public void addEdges(int [][]edges,boolean isDirected){
        for(int[] edge:edges){
            int s = edge[0];
            int d = edge[1];
            if(isDirected){
                adjMat[s][d] = 1;
            }else{
                adjMat[s][d] = 1;
                adjMat[d][s] = 1;
            }
        }
    }
    public void addEdgesWithWeights(int [][]edges,boolean isDirected){
        for(int[] edge:edges){
            int s = edge[0];
            int d = edge[1];
            int w = edge[2];
            if(isDirected){
                adjMat[s][d] = w;
            }else{
                adjMat[s][d] = w;
                adjMat[d][s] = w;
            }
        }
    }

    public void findDegree(int [][]edges,boolean isDirected){
        for(int[] edge:edges){
            int from = edge[0];
            int to = edge[1];
            if(isDirected){
                inDegree[to]++;
                outDegree[from]++;
            }else{
                degree[to]++;
                degree[from]++;
            }
        }
    }
    public void findDegreeMat(boolean isDirected){
        for(int i =0;i<adjMat.length;i++){
            for(int j=0;j<adjMat.length;j++){
                if(adjMat[i][j]==1) {
                    if (isDirected) {
                        inDegree[j]++;
                        outDegree[i]++;
                    } else {
                        degree[i]++;
                        degree[j]++;
                    }
                }
            }

        }
    }
    public void findDegreeList(boolean isDirected){
        for(int i =0;i<adjList.size();i++){
            for(int j=0;j<adjList.get(i).size();j++){
                int nei = adjList.get(i).get(j);
                if (isDirected) {
                    inDegree[nei]++;
                    outDegree[i]++;
                } else {
                    degree[i]++;
                    degree[nei]++;
                }

            }

        }
    }

    public static void main(String[] args) {
        int edges[][] = {{0,2},{0,3},{2,1}};
        Graph g = new Graph(4);
        // Undirected Graph
//        g.addEdges(edges,false);
//        g.printGraph();

        // Directed Graph
        g.addEdgesList(edges,true);
        g.printList();
        g.findDegreeList(true);
        g.printDegreeDir();

        int [][]edgesWithWeight = {{0,2,10},{0,1,20},{1,3,32}};
//        g.addEdgesWithWeights(edgesWithWeight,false);
//        g.printGraph();

//        g.addEdgesListWithWeights(edgesWithWeight,false);
//        g.printListCost();


//        g.addEdges(edges,false);
//        g.printGraph();
//        g.findDegreeMat(false);
//        g.printDegreeUnDir();

        // Print topological sort
        System.out.println(TopoLogicalSort.topoSortByKahn(g.adjList));


    }
}
