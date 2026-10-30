import java.util.*;
import java.lang.*;
import java.io.*;

class Bishop
{
    public static void main(String[] args){
        int n=4;
        char[][] board=new char[n][n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        fill(0, 0, board, n, 0, ans);

        System.out.println(ans);
    }
    static void fill(int row, int col, char[][] board,int n, int count, List<List<String>> ans){

        if(count == n){
            List<String> res = new ArrayList<>();

            for(char[] j : board){
                String str = new String(j);
                res.add(str);
            }

            ans.add(res);
            return;
        }

        if(row == n){
            return;
        }

        int nextRow = row;
        int nextCol = col + 1;

        if(nextCol == n){
            nextRow++;
            nextCol = 0;
        }

        if(is_safe(row, col, board, n)){
            board[row][col] = 'B';

            fill(nextRow, nextCol, board, n, count + 1, ans);

            board[row][col] = '.';
        }

        fill(nextRow, nextCol, board, n, count, ans);
    }

    static boolean is_safe(int row,int col,char[][] board,int n){
        if(l_diagonal(row-1,col-1,board)&&r_diagonal(row-1,col+1,board,n)){
            return true;
        }
        return false;
    }
    static boolean l_diagonal(int row,int col,char[][] board){
        if(row==-1||col==-1){
            return true;
        }
        if(board[row][col]=='B'){
            return false;
        }
        return l_diagonal(row-1,col-1,board);
    }
    static boolean r_diagonal(int row,int col,char[][] board,int n){
        if(row==-1||col==n){
            return true;
        }
        if(board[row][col]=='B'){
            return false;
        }
        return r_diagonal(row-1,col+1,board,n);
    }
}