package com.java.series;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// System.out.println("Enter A, B and N");
		long a = Integer.parseInt(scan.next());
		long b = Integer.parseInt(scan.next());
		long n = Integer.parseInt(scan.next());
		BigInteger t1 = BigInteger.valueOf(a);
		BigInteger t0 = BigInteger.valueOf(b);
		BigInteger t2 = BigInteger.valueOf(0);
		for (int i = 0; i < n - 1; i++) {
			t2 = (t1.multiply(t1)).add(t0);
			t0 = t1;
			t1 = t2;
		}
		System.out.println(t2);
		scan.close();
	}

}
