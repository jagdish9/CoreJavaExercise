package com.java.stack;

import java.util.Scanner;

public class StackImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayStack as = new ArrayStack(n);
		
		for(int i = 0; i < n; i++)
		{
			as.add(scan.nextInt());
		}
		
		as.dispaly();
		
		System.out.println("Peeked: "+as.peek());
		System.out.println("Polled: "+as.poll());
		as.dispaly();
		as.add(90);
		as.dispaly();
		
		scan.close();
	}

}
