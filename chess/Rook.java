import java.util.*;
class Rook{
    public static void main(String[] args){
        List<List<String>> ans=new ArrayList<>();
        int n=4;
        char[][] board=new char[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                board[row][col]='.';
            }
        }
        int row=0;
        for(int col=0;col<n;col++){
            board[row][col]='R';
            fill(row+1,board,n,ans);
            board[row][col]='.';
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
	            board[row][i]='R';
	            fill(row+1,board,n,ans);
	            board[row][i]='.';
	        }
	        
	    }
	    return;
	}
    static boolean is_safe(int row,int col,char[][] board,int n){
	    if(vertical(row-1,col,board)){
	        return true;
	    }
	    return false;
	}
    static boolean vertical(int row,int col,char[][] board){
	    if(row<0||col<0){
	        return true;
	    }
	    if(board[row][col]=='R'){
	        return false;
	    }
	    return vertical(row-1,col,board);
	}
}