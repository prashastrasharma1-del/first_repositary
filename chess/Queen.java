import java.util.*;
import java.lang.*;
import java.io.*;
class Queen 
{
    public static void main(String[] args){
    int n=4;
          List<List<String>> ans=new ArrayList<>();
		 
         char[][] board =new char[n][n];
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 board[i][j] = '.';
             }
             
             
         }
          
         int row=0;
         for(int i=0;i<n;i++){
             board[row][i]='Q';
             fill(row+1,board,n,ans);
             board[row][i]='.';
         }
         System.out.println(ans);
	}
	static void fill(int row,char[][] board, int n,List<List<String>> ans){
	    if(row==n){
	        List<String> res=new ArrayList<>();
	        for(char[] j:board){
              String str = new String(j);
              res.add(str);
	            
	        }
	        ans.add(res);
	        return;
	    }
	    
	    for(int i=0;i<n;i++){
	        if(is_safe(row,i,board,n)){
	            board[row][i]='Q';
	            fill(row+1,board,n,ans);
	            board[row][i]='.';
	        }
	        
	    }
	    return;
	}
	
	
	static boolean is_safe(int row,int col,char[][] board,int n){
	    if(l_diagonal(row-1,col-1,board) && r_diagonal(row-1,col+1,board,n) && vertical(row-1,col,board)){
	        return true;
	    }
	    return false;
	}
	
	
	static boolean l_diagonal(int row,int col,char[][] board){
	    if(row<0||col<0){
	        return true;
	    }
	    if(board[row][col]=='Q'){
	        return false;
	    }
	    return l_diagonal(row-1,col-1,board);
	}
	
	
	static boolean r_diagonal(int row,int col,char[][] board,int n){
	    if(row<0||col>=n){
	        return true;
	    }
	    if(board[row][col]=='Q'){
	        return false;
	    }
	    return r_diagonal(row-1,col+1,board,n);
	}
	
	
	static boolean vertical(int row,int col,char[][] board){
	    if(row<0||col<0){
	        return true;
	    }
	    if(board[row][col]=='Q'){
	        return false;
	    }
	    return vertical(row-1,col,board);
	}

}