import java.util.*;
import java.lang.*;
import java.io.*;

public class Main2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int[][] dp=new int[a.length()+1][b.length()+1];
		for(int i=1;i<a.length()+1;i++){
		    dp[i][0]=i; 
		}
		for(int i=1;i<b.length()+1;i++){
		    dp[0][i]=i; 
		}
		for(int i=1;i<dp.length;i++){
		    for(int j=1;j<dp[0].length;j++){
		        int pick=6000;
		        int not_pick=6000;
		        if(a.charAt(i-1)==b.charAt(j-1)){
		            pick=dp[i-1][j-1];
		        }
		        if(a.charAt(i-1)!=b.charAt(j-1)){
		            int insert=1+dp[i-1][j];
		            int delet=1+dp[i][j-1];
		            int replace=1+dp[i-1][j-1];
		            not_pick=Math.min(insert,Math.min(delet,replace));
		        }
		        dp[i][j]=Math.min(pick,not_pick);
		    }
		}
		System.out.println(dp[a.length()][b.length()]);

	}
}
