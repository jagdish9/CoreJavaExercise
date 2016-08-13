package com.java.insertion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string");
		String strng = scan.nextLine();
		int len = strng.length() - 1;
		char[] ch = strng.toCharArray();

		for (int i = len; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
