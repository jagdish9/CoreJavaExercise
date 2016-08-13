package com.java.hacker.earth;

import java.util.*;

public class QueueMaxElement {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int choose = scan.nextInt();
			switch (choose) {
			case 1: {
				int input = scan.nextInt();
				stack.push(input);
				break;
			}
			case 2: {
				stack.pop();
				break;
			}
			case 3: {
				int sum = 0;
				Iterator<Integer> iterator = stack.iterator();
				while (iterator.hasNext()) {
					int next = iterator.next();
					if (sum < next) {
						sum = next;
					}
				}
				System.out.println(sum);
				break;
			}

			}
		}
	}
}
