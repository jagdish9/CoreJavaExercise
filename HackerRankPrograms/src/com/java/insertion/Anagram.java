package com.java.insertion;

import java.util.Scanner;

public class Anagram {

	private static void sorting(String strng) {
		char[] ch = strng.toCharArray();
		int len = strng.length();
		char[] ch1 = new char[len];
		int half = len / 2;
		char key;
		int i = 0, n = 0, l = 0;
		int count = 0;
		char[] ch0 = new char[half];
		char[] ch2 = new char[half];
		int z = len - 1;
		for (int y = 0; y < half; y++) {
			ch0[y] = ch[z];
			z = z - 1;
		}

		for (int h = 0; h < half; h++) {
			if (ch0[h] == ch[h]) {
				n = n + 1;
			}
		}
		if (n == half) {
			System.out.println("0");
		} else {
			for (int j = 1; j < half; j++) // Start with 1 (not 0)
			{
				key = ch[j];
				for (i = j - 1; (i >= 0) && ((int) ch[i] > (int) key); i--) {
					ch[i + 1] = ch[i];
				}
				ch[i + 1] = key; // Put the key in its proper location
			}

			for (int j = half; j < len; j++) // Start with 1 (not 0)
			{
				ch2[l] = ch[j];
				l = l + 1;
			}
			i = 0;
			for (int j = 1; j < half; j++) // Start with 1 (not 0)
			{
				key = ch2[j];
				for (i = j - 1; (i >= 0) && ((int) ch2[i] > (int) key); i--) {
					ch2[i + 1] = ch2[i];
				}
				ch2[i + 1] = key; // Put the key in its proper location
			}

			for (int k = 0; k < half; k++) {
				if (ch[k] != ch2[k]) {
					count = count + 1;
				}
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int notstcase = scan.nextInt();
		for (int t = 0; t < notstcase; t++) {
			String strng = scan.next();
			int len = strng.length();
			int r = len / 2;
			if (len % 2 == 0) {
				sorting(strng);
			} else {
				System.out.println("-1");
			}
		}
	}
}
