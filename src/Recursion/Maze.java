package Recursion;

import java.util.*;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeCount(3,3));
//        mazePath("",3,3);
//        boolean[][] maze = {
//                {true,true,true},
//                {true,false,true},
//                {true,true,true}
//        };
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        System.out.println(mazePathWRestication("",maze,0,0));
//        System.out.println(mazeAllPath("",maze,0,0));

        int[][] path = new int[3][3];

        mazeAllPathPrint("",maze,0,0,path,1);
    }

    public static int mazeCount(int r,int c){
        if(r==1 || c==1) return 1;

        int left = mazeCount(r-1,c);
        int right = mazeCount(r,c-1);
        return left+right;
    }
    public static void mazePath(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r==1){
            mazePath(p+"R",r,c-1);
            return;
        }
        if(c==1){
            mazePath(p+"D",r-1,c);
            return;
        }

        mazePath(p+"D",r-1,c);
         mazePath(p+"R",r,c-1);

    }
    public static List<String> mazePathRet(String p,int r,int c){
        if(r==1 && c==1){
            List<String> l= new ArrayList<>();
            l.add(p);
            return l;
        }
        List<String> ans = new ArrayList<>();
        if(r==1){
            ans.addAll(mazePathRet(p+"R",r,c-1));
            return ans;
        }
        if(c==1){
            ans.addAll(mazePathRet(p+"D",r-1,c));
            return ans;
        }

        ans.addAll(mazePathRet(p+"D",r-1,c));
        if(r>1 && c>1){
            ans.addAll(mazePathRet(p+"Di",r-1,c-1));
        }
        ans.addAll(mazePathRet(p+"R",r,c-1));
        return ans;
    }
    public static List<String> mazePathWRestication(String p,boolean[][] maze,int r,int c){

        if(r==maze.length-1 && c==maze[0].length-1){
            List<String> l= new ArrayList<>();
            l.add(p);
            return l;
        }

        List<String> ans = new ArrayList<>();
        if (!maze[r][c]) return ans;
        if(c<maze.length-1){
            ans.addAll(mazePathWRestication(p+"R",maze,r,c+1));
        }
        if(r<maze.length-1){
            ans.addAll(mazePathWRestication(p+"D",maze,r+1,c));
        }

        return ans;
    }
    public static List<String> mazeAllPath(String p,boolean[][] maze,int r,int c) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        List<String> ans = new ArrayList<>();
        if (!maze[r][c]) return ans;
        else maze[r][c] = false;

        if (c < maze.length - 1) {
            ans.addAll(mazeAllPath(p + "R", maze, r, c + 1));
        }
        if (r < maze.length - 1) {
            ans.addAll(mazeAllPath(p + "D", maze, r + 1, c));
        }
        if (r > 0) {
            ans.addAll(mazeAllPath(p + "U", maze, r - 1 , c));
        }
        if (c > 0) {
            ans.addAll(mazeAllPath(p + "L", maze, r, c - 1));
        }

        maze[r][c] = true;
        return ans;
    }

    public static void mazeAllPathPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            System.out.println(p);
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }


        if (!maze[r][c]) return;
        else maze[r][c] = false;

        path[r][c] = step;

        if (c < maze.length - 1) {
            mazeAllPathPrint(p + "R", maze, r, c + 1,path,step + 1);
        }
        if (r < maze.length - 1) {
            mazeAllPathPrint(p + "D", maze, r + 1, c ,path,step + 1);
        }
        if (r > 0) {
            mazeAllPathPrint(p + "U", maze, r - 1 , c ,path,step + 1);
        }
        if (c > 0) {
            mazeAllPathPrint(p + "L", maze, r, c - 1 ,path,step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
