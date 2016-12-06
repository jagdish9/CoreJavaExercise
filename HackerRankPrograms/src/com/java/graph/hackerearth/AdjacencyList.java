package com.java.graph.hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdjacencyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		  Map<Integer, List<Integer>> _map = new HashMap<Integer, List<Integer>>();
		  int nodes  = scan.nextInt();
		  scan.nextLine();
		  int edges = scan.nextInt();
		  scan.nextLine();
		  int[][] arr = new int[edges][2];
		  for(int i = 0; i < edges; i++)
		  {
		    for(int j = 0; j < 2; j++)
		     {
		        arr[i][j] = scan.nextInt();
		     }
			 scan.nextLine();
		  }
		  
	    for(int i = 0; i < edges; i++)
		  {
		    List<Integer> _ls = new ArrayList<Integer>();
		    for(int j = 0; j < 1; j++)
		     {
			    _ls.add(arr[i][j+1]);
		        _map.put(arr[i][j], _ls);
		     }
		    
		  }
		  
		  Iterator<Map.Entry<Integer, List<Integer>>> it = _map.entrySet().iterator();
		  while(it.hasNext())
		  {
		    Map.Entry<Integer, List<Integer>> mentry = (Map.Entry<Integer, List<Integer>>)it.next();
			System.out.print(mentry.getKey()+" ");
			List<Integer> ls1 = (List<Integer>)mentry.getValue();
			Iterator<Integer> it1 = ls1.iterator();
			while(it1.hasNext())
		    {
			  System.out.print("-->"+it1.next());
		    } 
			System.out.println();
		  }
	      scan.close();
	}

}
