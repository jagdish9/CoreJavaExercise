package com.java.queue;

import java.util.Scanner;

public class QueueImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Queue01 q = new Queue01(n);
		for(int i = 0; i < n; i++)
		{
			q.add(scan.nextInt());
		}
		
		q.display();
		System.out.println("Polled: "+q.poll());
		q.display();
		q.add(75);
		q.display();
		
		scan.close();
	}

}
