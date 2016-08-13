package com.java.tree;

import java.io.IOException;

public class Solution {

	static int maxDifference(int[] a) {
		int i = 0, j = 1;
		int res = 0;
		while (i < a.length && j <= a.length) {
			if (a[i] < a[j]) {
				// System.out.println(i+" "+j);
				int temp = a[j] - a[i];
				if (temp > res) {
					res = temp;
				}
				j++;
			} else if (a[j] <= a[i]) {
				i++;
				j = i;
			}

		}
		return res;
	}

	public static void main(String[] args) throws IOException {

		int a[] = { 7, 9, 5, 6, 3, 2 };
		int res = maxDifference(a);
		System.out.print(res);
	}
}
