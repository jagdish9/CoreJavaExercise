package com.java.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String args[]) throws Exception {

		// Read input from stdin and provide input before running

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = line.length();

		char[] ch = line.toCharArray();
		char[] ch1 = new char[N];
		int j = 0;
		for (int i = N - 1; i >= 0; i--) {
			ch1[j] = ch[i];
			j++;
		}

		int c = 0;
		for (int k = 0; k < N; k++) {
			if (ch1[k] == ' ') {
				int l = k - 1;
				for (int m = l; m >= c; m--) {
					System.out.print(ch1[m]);
				}
				c = 0;
				System.out.print(' ');
			} else {
				c++;
			}

		}

	}
}
