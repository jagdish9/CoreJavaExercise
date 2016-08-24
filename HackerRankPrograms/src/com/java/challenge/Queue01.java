package com.java.challenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Queue<Integer> pq = new LinkedList<Integer>();
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
