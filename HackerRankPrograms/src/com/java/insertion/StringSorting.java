package com.java.insertion;

import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String:");
		String strng = scan.next();
		char[] ch = strng.toCharArray();
		int len = strng.length();
		char key;
		int i = 0;
		for (int j = 1; j < len; j++) // Start with 1 (not 0)
		{
			key = ch[j];
			for (i = j - 1; (i >= 0) && ((int) ch[i] > (int) key); i--) // Smaller
																		// values
																		// are
																		// moving
																		// up
			{
				ch[i + 1] = ch[i];
			}
			ch[i + 1] = key; // Put the key in its proper location
		}

		/*
		 * for(int j = 1; j < len; j++) { key = ch[j]; for(i = j - 1; i >= 0;
		 * i--) { if(i >= 0 && ((int)ch[i] > (int)key)) { ch[i+1] = ch[i]; } }
		 * ch[i+1] = key; }
		 */

		for (int k = 0; k < len; k++) {
			System.out.print(ch[k]);
		}
	}

}
