package com.java.graph;

import java.util.*;

public class Graph01 {

	private int V;
	private LinkedList<Integer> adj[];
	
	Graph01(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	public void BFS(int s)
	{
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() != 0)
		{
			s = queue.poll();
			System.out.print(s+" ");
			
			Iterator<Integer> it = adj[s].listIterator();
			while(it.hasNext())
			{
				int n = it.next();
				if(!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Graph01 g = new Graph01(4);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        

        System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
 
        g.BFS(2);
	}
}
