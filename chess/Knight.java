import java.util.*;
import java.lang.*;
import java.io.*;

class Knight
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes
		List<List<String>> ans=new ArrayList<>();
		 int n=4;
         char[][] board =new char[n][n];
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 board[i][j] = '.';
             }
             
             
         }
        
		 fill(0, 0, board, n, 0, ans);

			
		 
         System.out.println(ans);
	}
	static void fill(int row, int col, char[][] board,int n, int count, List<List<String>> ans) {
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
			board[row][col] = 'k';

			fill(nextRow, nextCol, board, n, count + 1, ans);

			board[row][col] = '.';
		}

		fill(nextRow, nextCol, board, n, count, ans);
	}

	
	
	static boolean is_safe(int row,int col,char[][] board,int n){
	    if(left_up(row-1,col-2,board) && left_down(row+1,col-2,board,n) && left_high(row-2,col-1,board) && left_low(row+2,col-1,board,n) && right_up(row-1,col+2,board,n) && right_down(row+1,col+2,board,n) && right_high(row-2,col+1,board,n) && right_low(row+2,col+1,board,n)){
	        return true;
	    }
	   
	   
	    return false;
	}
	
	
	static boolean left_up(int row,int col,char[][] board){
	    if(row<0||col<0){
	        return true;
	    }
	    if(board[row][col]=='k'){
	        return false;
	    }
	    return true;
	}
	static boolean left_down(int row,int col,char[][] board,int n){
	    if(row>=n||col<0){
	        return true;
	    }
	    if(board[row][col]=='k'){
	        return false;
	    }
	    return true;
	}
	static boolean left_high(int row,int col,char[][] board){
	    if(row<0||col<0){
	        return true;
	    }
	    if(board[row][col]=='k'){
	        return false;
	    }
	   return true;
	}
	static boolean left_low(int row,int col,char[][] board,int n){
	    if(row>=n||col<0){
	        return true;
	    }
	    if(board[row][col]=='k'){
	        return false;
	    }
	    return true;
	}
	
	
	static boolean right_up(int row,int col,char[][] board,int n){
	    if(row<0||col>=n){
	        return true;
	    }
	    if(board[row][col]=='k'){
	        return false;
	    }
	    return true;
	}
	static boolean right_down(int row,int col,char[][] board,int n){
	    if(row>=n||col>=n){
	        return true;
	    }
	    if(board[row][col]=='k'){
	        return false;
	    }
	    return true;
	}
	static boolean right_high(int row,int col,char[][] board,int n){
	    if(row<0||col>=n){
	        return true;
	    }
	    if(board[row][col]=='k'){
	        return false;
	    }
	   return true;
	}
	static boolean right_low(int row,int col,char[][] board,int n){
	    if(row>=n||col>=n){
	        return true;
	    }
	    if(board[row][col]=='k'){
	        return false;
	    }
	    return true;
	}
}
