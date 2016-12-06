package com.java.graph.hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdjacencyList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		  List<Integer> adj[] = null;
		  int nodes  = scan.nextInt();
		  scan.nextLine();
		  int edges = scan.nextInt();
		  scan.nextLine();
		  int[][] arr = new int[edges][2];
		  for(int i = 0; i < edges; i++)
		  {
			  int x = scan.nextInt();
			  int y = scan.nextInt();
		        new ArrayList<Integer>().add(y);
			    scan.nextLine();
		  }
		  scan.close();
	}

}
