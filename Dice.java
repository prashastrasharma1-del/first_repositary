import java.util.*;
import java.lang.*;
import java.io.*;

class Dice
{
	public static void main (String[] args)
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Long[] dp=new Long[n+1];
		dp[0]=(long)1;
		dp[1]=(long)1;
		if(n==1){
			System.out.println(dp[n]);
		}else{
			for(int i=2;i<=6;i++){
				dp[i]=2*dp[i-1];
				if(i==n){
					break;
				}
			}
			for(int i=7;i<n+1;i++){
				dp[i]=(dp[i-1]+dp[i-2]+dp[i-3]+dp[i-4]+dp[i-5]+dp[i-6])%((long)Math.pow(10,9)+7);
			}
			System.out.println(dp[n]);
		}
		
	}
	// static Long helper(int n,Long[] dp){
	//     if(n<0){
	//         return (long)0;
	//     }
	//     if(n==0){
	//         return (long)1;
	//     }
	//     if(dp[n]!=null){
	//         return dp[n];
	//     }
	//     int count=0;
	//     for(int i=1;i<=6;i++){
	//         count+=helper(n-i,dp);
	//     }
	//     dp[n]=count%((long)Math.pow(10,9)+7);
	//     return dp[n];
	// }
}