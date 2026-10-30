import java.util.*;
import java.lang.*;
import java.io.*;

class Graph_weight
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int n=5;
        int[][] edge={{1,2,5},{4,2,3},{1,3,7},{1,4,8},{3,5,2},{2,5,3}};
        System.out.println("Adjoint matrix of undirected graph(u,v,w)");
        adj_m_1(n,edge);
        System.out.println("Adjoint matrix of directed graph(u,v,w)");
        adj_m_2(n,edge);
        System.out.println("Adjoint list using ArrayList");
        System.out.println("Adjoint list of undirected graph(u,v,w)");
        adj_l_1(n,edge);
        System.out.println("Adjoint list of directed graph(u,v,w)");
        adj_l_2(n,edge);
        System.out.println("Adjoint list using map");
        System.out.println("Adjoint list of undirected graph(u,v,w)");
        adj_l_1_map(n,edge);
        System.out.println("Adjoint list of directed graph(u,v,w)");
        adj_l_2_map(n,edge);
        
	}
    static void adj_m_1(int n,int[][] edge){
        int[][] adj_m=new int[n+1][n+1];
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            int w=edge[i][2];
            adj_m[u][v]=w;
            adj_m[v][u]=w;
        }
        for(int[] j:adj_m){
            System.out.println(Arrays.toString(j));
        }
    }
    static void adj_m_2(int n,int[][] edge){
        int[][] adj_m=new int[n+1][n+1];
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            int w=edge[i][2];
            adj_m[u][v]=w;
        }
        for(int[] j:adj_m){
            System.out.println(Arrays.toString(j));
        }
    }
    static void adj_l_1(int n,int[][] edge){
        HashMap<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            int w=edge[i][2];
            if(!map.containsKey(u)){
                map.put(u,new ArrayList<ArrayList<Integer>>());
            }
            map.get(u).add(new ArrayList<>(Arrays.asList(v, w)));

            if(!map.containsKey(v)){
                map.put(v,new ArrayList<ArrayList<Integer>>());
            }
            map.get(v).add(new ArrayList<>(Arrays.asList(u, w)));
        }
        System.out.println(map.toString());
    }
    static void adj_l_2(int n,int[][] edge){
        HashMap<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            int w=edge[i][2];
            if(!map.containsKey(u)){
                map.put(u,new ArrayList<ArrayList<Integer>>());
            }
            map.get(u).add(new ArrayList<>(Arrays.asList(v, w)));
        }
        System.out.println(map.toString());
    }
    static void adj_l_1_map(int n,int[][] edge){
        HashMap<Integer, ArrayList<Map.Entry<Integer, Integer>>> map=new HashMap<>();
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            int w=edge[i][2];
            if(!map.containsKey(u)){
                map.put(u, new ArrayList<>());
            }
            map.get(u).add(new AbstractMap.SimpleEntry<>(v, w));

            if(!map.containsKey(v)){
                map.put(v, new ArrayList<>());
            }
            map.get(v).add(new AbstractMap.SimpleEntry<>(u, w));
        }
        System.out.println(map.toString());
    }
    static void adj_l_2_map(int n,int[][] edge){
        HashMap<Integer,ArrayList<Map.Entry<Integer, Integer>>> map=new HashMap<>();
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            int w=edge[i][2];
            if(!map.containsKey(u)){
                map.put(u, new ArrayList<>());
            }
            map.get(u).add(new AbstractMap.SimpleEntry<>(v, w));
        }
        System.out.println(map.toString());
    }
}
