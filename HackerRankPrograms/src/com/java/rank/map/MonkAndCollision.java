package com.java.rank.map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonkAndCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Scanner scan = new Scanner(System.in);
	     Set<Integer> _set = new HashSet<Integer>();
	       int T = scan.nextInt();
	       scan.nextLine();
	       for(int i = 0; i < T; i++)
	       {
	       	 int N = scan.nextInt();
	       	 scan.nextLine();
	       	 int[] arN = new int[N];
	       	 for(int j = 0; j < N; j++)
	       	 {
	       	 	arN[j] = scan.nextInt();
	       	 }
	       	 
	       	 for(int k = 0; k < N; k++)
	       	 {
	       	 	_set.add(arN[k] % 10);
	       	 }
	       	 
	       	 System.out.println(N-_set.size());
	       }
	       scan.close();
	}

}
