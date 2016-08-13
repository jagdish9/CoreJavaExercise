package com.java.insertion;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSplit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string");
		String strng = scan.nextLine();

		StringTokenizer st = new StringTokenizer(strng, "_");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
