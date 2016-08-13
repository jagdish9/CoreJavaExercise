package com.java.hacker.earth;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueSecond {

	public static void main(String args[]) throws Exception {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> queue1 = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			queue.add(scan.nextInt());
		}
		int[] ar = new int[N];

		for (int i = 0; i < N; i++) {
			ar[i] = scan.nextInt();
		}

		int j = 0;
		int l = 0;
		int c = 0;
		Iterator<Integer> iterator = queue.iterator();
		while (iterator.hasNext() && j < N) {
			int temp = iterator.next();
			int temp1 = ar[j];
			if (temp != temp1) {
				queue1.add(temp);
				c++;
			} else {
				l++;
			}
			if (j == N - 1) {
				j = 0;
				l = 0;
				queue.clear();
				queue = queue1;
				queue1.clear();
			}
			if (j == N - 1 && l == N) {
				break;
			}
			j++;
		}
		int no = 0;
		Iterator<Integer> iterator1 = queue.iterator();
		while (iterator1.hasNext()) {
			no++;
		}
		System.out.println(c + no);
	}
}
