package com.java.hackerrank.java;

import java.util.Scanner;

public class BracketString {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();

			// Complete the code
			int half = 0, c = 0;
			int len = input.length();
			char[] ch = input.toCharArray();
			if (len % 2 != 0) {
				System.out.println("false");
			} else {
				half = len / 2;
				for (int i = 0; i < half; i++) {
					if (ch[i] == '[') {
						if (']' == ch[half + i]) {
							c = c + 1;
						}
					}
					if (ch[i] == '(') {
						if (')' == ch[half + i]) {
							c = c + 1;
						}
					}
					if (ch[i] == '{') {
						if ('}' == ch[half + i]) {
							c = c + 1;
						}
					}
				}
				if (half == c) {
					System.out.println("true");
				} else {
					for (int i = 0; i < len; i++) {
						if (ch[i] == '[') {
							if (']' == ch[1 + i]) {
								c = c + 1;
							}
						}
						if (ch[i] == '(') {
							if (')' == ch[1 + i]) {
								c = c + 1;
							}
						}
						if (ch[i] == '{') {
							if ('}' == ch[1 + i]) {
								c = c + 1;
							}
						}
					}

					if (half == c) {
						System.out.println("true");
					}

				}
			}
		}
		sc.close();
	}
}
