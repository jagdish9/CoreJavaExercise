package com.java.challenge;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueue02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		PriorityQueue<String> pq = new PriorityQueue<String>();
		for(int i = 0; i < N; i++)
		{
			pq.add(scan.next());
		}
		
		while(!pq.isEmpty())
		{
			System.out.print(pq.poll()+" ");
		}
		scan.close();
	}
}
