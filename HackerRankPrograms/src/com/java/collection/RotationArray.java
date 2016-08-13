package com.java.collection;

import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int Q = scan.nextInt();

		int[] arN = new int[N];
		for (int i = 0; i < N; i++) {
			arN[i] = scan.nextInt();
		}

		int[] arQ = new int[Q];
		for (int i = 0; i < Q; i++) {
			arQ[i] = scan.nextInt();
		}

		int l = 0;
		int temp = 0;
		for (int j = 0; j < K; j++) {
			l = N - 1;
			temp = arN[l];
			while (l > 0) {
				arN[l] = arN[l - 1];
				l--;
			}
			arN[0] = temp;
		}

		for (int t = 0; t < Q; t++) {
			System.out.println(arN[arQ[t]]);
		}
	}
}
