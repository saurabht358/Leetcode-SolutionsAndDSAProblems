package Recursion;

public class Nkights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        System.out.println(nkights(board,0,0,n));
    }
    public static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean x:row){
                if(x) System.out.print("K ");
                else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int nkights(boolean[][] board,int row,int col,int n){
        if(n==0){
            display(board);
            return 1;
        }
        int count=0;
        if(row== board.length && col== board.length ) return count;
        if(col==board.length){
            count+=nkights(board,row+1,0,n);
            return count;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            count+= nkights(board,row,col+1,n-1);
            board[row][col]=false;
        }

        return count + nkights(board,row,col+1,n);
    }
    public static boolean isSafe(boolean[][] board,int row,int col){
        if(row-1 >=0 && col-2 >= 0 && board[row-1][col-2]) return false;

        if(row-2 >=0 && col-1 >= 0 && board[row-2][col-1]) return false;

        if(row-1 >= 0 && (col+2) < board.length && board[row-1][col+2]) return false;

        if(row-2 >= 0 && (col+1) < board.length && board[row-2][col+1]) return false;

        if(row>=0 && row<board.length && col>=0 && col< board.length) return true;
        return false;
    }
}
