package com.java.hacker.earth;

import java.util.*;

class TestQueue {
	public static void main(String args[]) throws Exception {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		ArrayList<Integer> aList = new ArrayList<Integer>();

		int max = 0;
		int index = 0;

		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[] ar = new int[N];

			for (int j = 0; j < N; j++) {
				ar[j] = scan.nextInt();
			}

			for (int l = 0; l < K; l++) {
				max = ar[0];
				for (int m = 0; m < N; m++) {
					if (ar[m] > max) {
						max = ar[m];
						index = m;
					}
				}
				aList.add(max);
				max = max / 2;
				ar[index] = max;
			}
			int sum = 0;
			Iterator<Integer> iterator = aList.iterator();
			while (iterator.hasNext()) {
				sum = sum + iterator.next();
			}

			System.out.println(sum);

		}
	}
}
