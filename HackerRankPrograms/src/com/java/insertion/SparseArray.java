package com.java.insertion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int notstcases = scan.nextInt();
		List<String> str = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < notstcases; i++) {
			str.add(scan.next());
		}

		int noOfQueries = scan.nextInt();
		List<String> str1 = new ArrayList<String>();

		for (int i = 0; i < noOfQueries; i++) {
			str1.add(scan.next());
		}

		Iterator<String> ls1 = str1.iterator();
		ListIterator<String> ls = str.listIterator();
		while (ls1.hasNext()) {
			count = 0;
			String nxt = ls1.next();
			while (ls.hasNext()) {
				String nxt1 = ls.next();
				if (nxt.equals(nxt1)) {
					count = count + 1;
				}
			}
			while (ls.hasPrevious()) {
				ls.previous();
			}
			System.out.println(count);
		}

	}

}
