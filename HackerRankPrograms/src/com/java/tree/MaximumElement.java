package com.java.tree;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int temp = 0, max = 0;

		for (int i = 1; i <= size; i++) {
			int choose = scan.nextInt();
			if (choose == 1) {
				int no = scan.nextInt();
				stack.push(no);
			}

			if (choose == 2) {
				stack.pop();
			}

			if (choose == 3) {
				/*
				 * max = stack.pop(); while(!stack.empty()) { temp =
				 * stack.pop(); if(temp < max) { max = temp; } }
				 */

				Iterator<Integer> iterator = stack.iterator();
				max = iterator.next();
				while (iterator.hasNext()) {
					temp = iterator.next();
					if (temp > max) {
						max = temp;
					}
				}

				System.out.println(max);
			}

		}
		scan.close();

	}
}
