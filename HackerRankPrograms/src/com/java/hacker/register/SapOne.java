package com.java.hacker.register;

import java.util.*;

class SapOne {
	public static void main(String args[]) throws Exception {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arSize = new int[N];

		for (int i = 0; i < N; i++) {
			arSize[i] = scan.nextInt();
		}

		int[][] xy = new int[N - 1][N - 1];
		for (int j = 0; j < N - 1; j++) {
			for (int k = 0; k < N - 1; k++) {
				xy[j][k] = scan.nextInt();
			}
		}

		int Q = scan.nextInt();
		int[][] uv = new int[Q][Q];
		for (int l = 0; l < Q; l++) {
			for (int m = 0; m < Q; m++) {
				uv[l][m] = scan.nextInt();
			}
		}

		int c = 0;
		for (int t = 0; t < Q; t++) {
			for (int d = 0; d < Q; d++) {
				if (xy[t][d] == uv[t][d]) {
					c++;
				}
			}
		}

		if (c == Q) {
			System.out.println(c - 1);
		} else {
			System.out.println(c);
		}
	}
}