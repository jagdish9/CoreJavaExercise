package com.java.challenge;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Deque<Integer> dq = new LinkedList<Integer>();
		for(int i = 0; i < N; i++)
		{
			dq.add(scan.nextInt());
		}
		Iterator<Integer> it = dq.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		Iterator<Integer> it1 = dq.descendingIterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+" ");
		}
		scan.close();
	}

}
