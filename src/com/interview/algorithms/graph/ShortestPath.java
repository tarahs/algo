package com.interview.algorithms.graph;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Deepak on 4/22/19.
 */
public class ShortestPath {


    public static final int V = 7;

    public static void main(String[] args){

    }

    public int[] shortestPath(int[][] graph, int src){

        Set<Integer> visited = new HashSet<>();
        int[] dist = new int[V];
        int[] sd = new int[V];

        for(int i=0; i<V; i++){
            dist[i] = 0x7fffffff;
        }

        dist[src] = 0;

        for(int i=0; i<V-1; i++){

            int min_vertex = findMinDistVertex(dist, visited);

            visited.add(min_vertex);

            //find min dist for his neighbors
            for(int v=0; v< V; v++){

                if(graph[min_vertex][v] != 0 && !visited.contains(v) && dist[min_vertex] != Integer.MAX_VALUE && (dist[v] > dist[min_vertex]+graph[min_vertex][v])){
                    dist[v] = dist[min_vertex] + graph[min_vertex][v];
                }

            }


        }

        return dist;

    }

    public int findMinDistVertex(int[] dist, Set<Integer> visited ){

        int min_dist = 0x7fffffff;
        int min_vertex = -1;

        for(int i=0; i<V; i++){
            if(!visited.contains(i) && min_dist >= dist[i]){
                min_dist = dist[i];
                min_vertex = i;
            }
        }
        return min_vertex;
    }

}
