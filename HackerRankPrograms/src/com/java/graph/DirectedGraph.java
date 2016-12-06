package com.java.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DirectedGraph {

	private int V; 
	private LinkedList<Integer> adj[];
	
	DirectedGraph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
			adj[i] = new LinkedList<Integer>();
		
	}
	
	public void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	public void DFSUtil(int v, boolean visited[])
	{
		visited[v] = true;
		int n;
		
		Iterator<Integer> it = adj[v].iterator();
		while(it.hasNext())
		{
			n = it.next();
			if(!visited[n])
			{
				DFSUtil(n, visited);
			}
		}
	}
	
	public DirectedGraph getTranspose()
	{
		DirectedGraph dg = new DirectedGraph(V);
		for(int j = 0; j < V; j++)
		{
			Iterator<Integer> it = adj[j].iterator();
			while(it.hasNext())
				dg.adj[it.next()].add(j);
		}
		return dg;
	}
	
	public boolean isSC()
	{
		return true;
	}
}
