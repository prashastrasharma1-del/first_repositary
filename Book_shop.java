import java.util.*;
import java.lang.*;
import java.io.*;

public class Book_shop
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] price=new int[n];
		int[] page=new int[n];
		for(int i=0;i<n;i++){
		    price[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    page[i]=sc.nextInt();
		}
        int[][] dp=new int[n+1][x+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int not_pick=dp[i-1][j];
                int pick=0;
                if(price[i-1]<=j){
                    pick=page[i-1]+dp[i-1][j-price[i-1]];
                }
                dp[i][j]=Math.max(not_pick,pick);
            }
        }
        System.out.println(dp[n][x]);
	}
}

    // static int helper(int num,Integer[] dp){
    //     if(num<0){
    //         return 0;
    //     }
    //     if(num==0){
    //         return 0;
    //     }
    //     if(dp[num]!=null){
    //         return dp[num];
    //     }
    //     int count=Integer.MAX_VALUE;
    //     int n=num;
    //     while(n>0){
    //         int d=n%10;
    //         if(d!=0){
    //             count=Math.min(1+helper(num-d,dp),count);
    //         }
    //         n=n/10;
    //     }
    //     dp[num]=count;
    //     return dp[num];
    // }
// }