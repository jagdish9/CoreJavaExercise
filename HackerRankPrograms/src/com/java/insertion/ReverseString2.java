package com.java.insertion;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string");
		String strng = scan.nextLine();
		int len = strng.length() - 1;
		char[] ch = strng.toCharArray();
		char[] ch1 = new char[strng.length()];
		int asg = 0, opt = 0;
		for (int i = len; i >= 0; i--) {
			ch1[i] = ch[i];
			System.out.print(ch1[i]);
		}
		System.out.println();
		for (int k = 0; k <= len; k++) {
			if (ch1[k] == ' ' || ch1[k] == '\0') {
				asg = k - 1;
				for (int j = asg; j >= 0; j--) {
					System.out.print(ch1[j]);
				}
			}
			{
				opt = opt + 1;
			}
		}
	}

}
