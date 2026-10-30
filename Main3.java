import java.util.*;
import java.lang.*;
import java.io.*;

public class Main3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int to_sum=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    to_sum+=arr[i];
		}
		int[][] dp=new int[n+1][to_sum+1];
		for(int i=1;i<dp.length;i++){
		    for(int j=1;j<dp[0].length;j++){
		        int pick=0;
		        if(arr[i-1]==j){
		            pick=1+dp[i-1][j-arr[i-1]];
		        }else if(arr[i-1]<j){
		            pick=Math.max(dp[i-1][j-arr[i-1]],dp[i-1][j]);
		        }
		        int not_pick=dp[i-1][j];
		        
		        dp[i][j]=Math.max(not_pick,pick);
		    }
		}
		ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<dp[0].length;i++){
            if(dp[dp.length-1][i]==1){
                ans.add(i);
            }
        }
        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
	}
}
