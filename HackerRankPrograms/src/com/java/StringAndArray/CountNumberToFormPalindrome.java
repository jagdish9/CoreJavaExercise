package com.java.StringAndArray;

import java.util.Scanner;

public class CountNumberToFormPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// no of test case
		int T = in.nextInt();

		// string array
		String[] s = new String[T];
		for (int i = 0; i < T; i++) {
			s[i] = in.next();
		}

		// find a median value first to check the value of each character
		// the reason why we find median value is to use characteristic's of
		// palindromes
		// which is symmetric from the median position
		// to compare left side of character and right side of character
		// first find a median value
		// there will be 2 case
		// if length of string is odd
		// or length of string is even

		for (int i = 0; i < T; i++) {
			int len = s[i].length();
			int left, med, right = 0;
			if (len % 2 != 0) {
				med = len / 2;
				left = med - 1;
				right = med + 1;
			} else {
				med = (len / 2) - 1;
				left = med;
				right = med + 1;
			}

			char[] c = s[i].toCharArray();

			int count = 0;

			// compare and count total
			while (left >= 0 && right <= (len - 1)) {
				int a = (int) (c[left] - '0');
				int b = (int) (c[right] - '0');

				count = count + Math.abs(b - a);

				left--;
				right++;
			}
			System.out.println(count);
		}
		in.close();

	}
}