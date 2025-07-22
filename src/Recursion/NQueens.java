package Recursion;
import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        int n=5;
        boolean[][] board= new boolean[n][n];
        System.out.println(nqueens(board,0,n));
    }
    public static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean x:row){
                if(x) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int nqueens(boolean[][] board,int row,int n){
        if(n==0){
            display(board);
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+= nqueens(board,row+1,n-1);
                board[row][col]=false;
            }

        }
        return count;
    }
    public static boolean isSafe(boolean[][] board,int row,int col){
        // check straight
        for(int i=row;i>=0;i--){
            if(board[i][col]) return false;
        }
        int j=col;
        // check left diagonal
        for(int i=row;i>=0 && j>=0;i--,j--){
            if(board[i][j]) return false;
        }
        //check right diagonal
        j=col;
        for(int i=row;i>=0 && j<board.length;i--,j++){
            if(board[i][j]) return false;
        }
        return true;
    }
}
