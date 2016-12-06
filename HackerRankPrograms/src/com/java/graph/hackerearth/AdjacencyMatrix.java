package com.java.graph.hackerearth;

import java.util.Scanner;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int nodes = scan.nextInt();
		scan.nextLine();
		int edges = scan.nextInt();
		scan.nextLine();
		boolean[][] arEdges = new boolean[edges][edges];
		for(int i = 0; i < edges; i++)
		{
			for(int j = 0; j < edges; j++)
			{
				arEdges[i][j] = false;
			}
		}
		
		for(int i = 0; i < edges; i++)
		{
				arEdges[scan.nextInt()][scan.nextInt()] = true;
			    scan.nextLine();
		}
		
		if(arEdges[3][4])
		{
			System.out.println("There is an edge between 3 and 4");
		}
		else
		{
			System.out.println("There is no edge between 3 and 4");
		}
		
		if(arEdges[2][3])
		{
			System.out.println("There is an edge between 2 and 3");
		}
		else
		{
			System.out.println("There is no edge between 2 and 3");
		}
		scan.close();
	}

}
