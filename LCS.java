import java.util.*;
import java.lang.*;
import java.io.*;

public class Lcs
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int[] a=new int[n];
	    int[] b=new int[m];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<m;i++){
	        b[i]=sc.nextInt();
	    }
	    int[][] dp=new int[m+1][n+1];
	    for(int i=1;i<dp.length;i++){
	        for(int j=1;j<dp[0].length;j++){
	           int not_pick= Math.max(dp[i-1][j],dp[i][j-1]);
	           int pick=Integer.MIN_VALUE;
	            if(a[j-1]==b[i-1]){
	                pick=1+dp[i-1][j-1];
	            }
	            dp[i][j]=Math.max(not_pick,pick);
	        }
	    }
	    ArrayList<Integer> ans=new ArrayList<>();
	    int i=dp.length-1;
	    int j=dp[0].length-1;
	    while(i>=1&&j>=1){
	        if(b[i-1]!=a[j-1]){
	            if(dp[i-1][j]>dp[i][j-1]){
	                i--;
	            }else if(dp[i-1][j]<dp[i][j-1]){
	                j--;
	            }else{
	                i--;
	            }
	        }else{
	            ans.add(b[i-1]);
	            j--;
	            i--;
	        }
	    }
	    System.out.println(dp[m][n]);
	     Collections.reverse(ans);
	     for(int k=0;k<ans.size();k++){
	         System.out.print(ans.get(k)+" ");
	     }
	     

	}
}
