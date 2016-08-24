package com.java.challenge;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i < N; i++)
		{
			pq.add(scan.nextInt());
		}
		
		Iterator<Integer> it =   pq.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		scan.close();
	}

}
