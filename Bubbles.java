import java.util.*;
import java.lang.*;
import java.io.*;


import java.util.Scanner;
class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
		    nums[i]=sc.nextInt();
		}
		
        Arrays.sort(nums);
        int[] arr=new int[nums[nums.length-1]+1];
        int[] dp=new int[arr.length+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        System.out.println(game(arr,1,dp));
	}
	static int game(int[] arr,int i,int[] dp){
	    if(i>arr.length-1){
	        return 0;
	    }
	    if(dp[i]!=-1){
	        return dp[i];
	    }
	    int point_1=arr[i]*i+game(arr,i+2,dp);
	    int point_2=game(arr,i+1,dp);
	    dp[i]=Math.max(point_1,point_2);
	    return dp[i];
	}
}

// import java.util.Arrays;
// class Bubbles{
//     public static void main(String[]args){
//         int[] arr={2,3,1,1,4};
//         boolean[] temp=new boolean[arr.length];
//         boolean ans=move(arr,0,0,temp);
//         System.out.println(ans);

//     }
//     static boolean move(int[] arr,int p,int jump,boolean[] temp){
//         if(p==arr.length-1){
//             System.out.println(p);
//             return true;
//         }
//         if(arr[p]>arr.length-1||arr[p]==0||p>arr.length-1){
//             return false;
//         }
//         while(jump<=arr[p]){
//             p=jump+1;
//             if(temp[p]!=true){
//                 temp[p]=move(arr,p,p,temp);
//             }
//             p=jump;
//             jump++;
//         }
//         return false;
//     }    

    // static void selection(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr.length-i-1;j++){
                
    //         }
    //     }
    // }
//     static void bubble(int[] arr){
//         boolean swaped;
//         for(int i=0;i<arr.length;i++){
//             swaped=false;
//             for(int j=1;j<arr.length-i;j++){
//                 if(arr[j]<arr[j-1]){
//                     int temp= arr[j];
//                     arr[j]=arr[j-1];
//                     arr[j-1]=temp;
//                     swaped=true;
//                 }
//             }
//             if(swaped==false){
//                 break;
//             }
//         }
//     }


// }