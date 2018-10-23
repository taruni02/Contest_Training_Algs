import java.io.*;
import java.util.*;
import java.util.LinkedList;
public class Bfs{
   static class Graph{
      int v; 
      LinkedList<Integer> adjList[]; 
      Graph(int v) 
        { 
            this.v = v; 
            adjList = new LinkedList[v]; 
            for(int i = 0; i < v ; i++){ 
                adjList[i] = new LinkedList<>(); 
            } 
        }
      static void addEdge(Graph graph, int src, int dest) {   
        graph.adjList[src].add(dest); 
        graph.adjList[dest].add(src); 
         } 
         }
         
         public static void main(String args[]) 
         {  
              int v = 8; 
              Graph graph = new Graph(v); 
              Graph.addEdge(graph, 0, 3); 
              Graph.addEdge(graph, 0, 2); 
              Graph.addEdge(graph, 2, 1); 
              Graph.addEdge(graph, 2, 4); 
              Graph.addEdge(graph, 4, 5); 
              Graph.addEdge(graph, 5, 7);
              Graph.addEdge(graph, 1, 6); 
              int n = 0;
              boolean[] visited = new boolean[v];
              for(int i=0; i< v; i++)
              {
               if(visited[i] == false)
               System.out.println(i);
               visited[i] = true;
               bfs(graph,i, visited,n);
              
              } 
              System.out.println();
              
         }
         static void bfs(Graph g, int x, boolean [] visited, int next)
         {
            for(int y=0;y < g.adjList[x].size() ;y++)
            {
            if(visited[g.adjList[x].get(y)] == false)
            System.out.println(g.adjList[x].get(y));
            visited[g.adjList[x].get(y)] = true;
            }
         }
      
} 