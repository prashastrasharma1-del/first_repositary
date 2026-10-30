import java.util.*;
import java.lang.*;
import java.io.*;

class Graph
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int n=5;
        int[][] edge={{1,2},{4,2},{1,3},{1,4},{3,5},{2,5}};
        System.out.println("Adjoint matrix of undirected graph(u,v)");
        adj_m_1(n,edge);
        System.out.println("Adjoint matrix of directed graph(u,v)");
        adj_m_2(n,edge);
        System.out.println("Adjoint list of undirected graph(u,v)");
        adj_l_1(n,edge);
        System.out.println("Adjoint list of directed graph(u,v)");
        adj_l_2(n,edge);
        
	}
    static void adj_m_1(int n,int[][] edge){
        int[][] adj_m=new int[n+1][n+1];
        for(int i=0;i<edge.length;i++){
                adj_m[edge[i][0]][edge[i][1]]=1;
                adj_m[edge[i][1]][edge[i][0]]=1;
        }
        for(int[] j:adj_m){
            System.out.println(Arrays.toString(j));
        }
    }
    static void adj_m_2(int n,int[][] edge){
        int[][] adj_m=new int[n+1][n+1];
        for(int i=0;i<edge.length;i++){
                adj_m[edge[i][0]][edge[i][1]]=1;
        }
        for(int[] j:adj_m){
            System.out.println(Arrays.toString(j));
        }
    }
    static void adj_l_1(int n,int[][] edge){
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            if(!map.containsKey(u)){
                map.put(u,new ArrayList<Integer>());
            }
            map.get(u).add(v);
            if(!map.containsKey(v)){
                map.put(v,new ArrayList<Integer>());
            }
            map.get(v).add(u);
        }
        System.out.println(map.toString());
    }
    static void adj_l_2(int n,int[][] edge){
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            if(!map.containsKey(u)){
                map.put(u,new ArrayList<Integer>());
            }
            map.get(u).add(v);
        }
        System.out.println(map.toString());
    }
}
