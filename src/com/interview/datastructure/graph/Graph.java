package com.interview.datastructure.graph;

import java.util.*;

class Graph {

    //Size of an array(Number of Vertices)
    int n;
    //array of linkidlists
    LinkedList<Integer>[] arrayOfLinkedLists;

    @SuppressWarnings( "unchecked" )
    public Graph( int n )
    {
        this.n = n;
        arrayOfLinkedLists = new LinkedList[n];
        for( int i = 0; i < n; i++ )
        {
            arrayOfLinkedLists[i] = new LinkedList();
        }
    }

    //Add connection from one vertex to another
    public void addEdge( int src, int dest )
    {
        //If Bidirational then add node to both the lists
        arrayOfLinkedLists[src].add(dest);

        //arrayOfLinkedLists[dest].addFirst(src);
    }

    /**
     * O(V+E) 1. Shortest Path and Minimum Spanning Tree for unweighted graph
     * 
     * 2. Peer to Peer Networks to find all neighbor nodes
     * 
     * 3. Social Networking Websites -- find people within a given distance ‘k’ from a person
     * 
     * 4. Breadth First Search is used to find all neighboring locations.
     */
    // prints BFS traversal from a given source s
    @SuppressWarnings( { "rawtypes", "unchecked" } )
    public void BFSTraversal( int v )
    {

        // Mark all the vertices as not visited(By default
        // set as false)
        boolean isVisted[] = new boolean[n];

        isVisted[v] = true;
        Queue<Integer> queue = new java.util.LinkedList<Integer>();
        queue.add(v);
        System.out.println(v);
        while( queue != null && !queue.isEmpty() )
        {

            v = queue.poll();
            Iterator it = arrayOfLinkedLists[v].listIterator();
            while( it.hasNext() )
            {
                int i = (int) it.next();
                if( !isVisted[i] )
                {
                    isVisted[i] = true;
                    queue.add(i);
                    System.out.println(i);
                }

            }
        }

    }

    /**
     * O(V+E) ADV: 1. Detecting cycle in a graph
     * 
     * 2. Path Finding
     * 
     * 3. Topological Sorting
     */
    public void DFSUtil( int v, boolean[] visited )
    {
        visited[v] = true;
        System.out.println(v);

        Iterator it = arrayOfLinkedLists[v].listIterator();
        while( it.hasNext() )
        {
            int i = (int) it.next();
            if( !visited[i] )
            {
                DFSUtil(i, visited);
            }
        }
    }

    public void DFS( int v )
    {
        boolean visited[] = new boolean[n];
        DFSUtil(v, visited);
    }

    public void DFS2(int v){
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        visited[v] = true;
        stack.push(v);
        System.out.println(v);
        while(true){
            Iterator it = arrayOfLinkedLists[v].listIterator();
            if(it.hasNext()){
                v = (Integer)it.next();
                if(!visited[v]){
                    visited[v] = true;
                    stack.push(v);
                    System.out.println(v);
                }

            }
            else {
                if (stack.isEmpty())
                    break;
                v = stack.pop();
            }

        }
    }

    /**
     *
     * @return
     */
    public boolean isCyclic()
    {

        Set<Integer> unvisitedVertex = new HashSet<Integer>();
        Set<Integer> visited = new HashSet<Integer>();
        Set<Integer> completedlyVisited = new HashSet<Integer>();

        for( int i = 1; i <= n; i++ )
        {
            unvisitedVertex.add(i);
        }

        while( unvisitedVertex.size() > 0 )
        {
            if( dfsCycleDet(unvisitedVertex.iterator().next(), unvisitedVertex, visited, completedlyVisited) )
                return true;
        }

        return false;
    }

    /**
     * Detect Cycle in a directed graph
     * @param current
     * @param unvisitedVertex
     * @param visited
     * @param completedlyVisited
     * @return
     */
    public boolean dfsCycleDet( Integer current, Set<Integer> unvisitedVertex, Set<Integer> visited,
            Set<Integer> completedlyVisited )
    {

        moveVertex(current, unvisitedVertex, visited);
        LinkedList<Integer> adjVertices = arrayOfLinkedLists[current];
        if( adjVertices == null || adjVertices.isEmpty() )
            return false;

        for( Integer adjVertex : adjVertices )
        {

            if( completedlyVisited.contains(adjVertex) )
                continue;

            if( visited.contains(adjVertex) )
                return true;

            if( dfsCycleDet(adjVertex, unvisitedVertex, visited, completedlyVisited) )
                return true;
        }

        moveVertex(current, visited, completedlyVisited);
        return false;
    }

    public void moveVertex( Integer current, Set<Integer> source, Set<Integer> dest )
    {
        source.remove(current);
        dest.add(current);
    }

    /**
     * 0 -->1 -->2 1 -->2 2 -->0 -->3 3 -->3
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("\n Breadth First Search");
        //graph.BFSTraversal(2);

        System.out.println("\n Depth First Search");

        graph.DFS2(2);

    }

}
