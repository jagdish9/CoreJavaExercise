package com.java.insertion;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string");
		String strng = scan.nextLine();
		int len = strng.length() - 1;
		char[] ch = strng.toCharArray();

		for (int i = 0; i <= len; i++) {

			if (ch[i] == '_') {
				ch[i] = ' ';
				System.out.println();

			}
			System.out.print(ch[i]);
		}
	}

}
