package com.java.interview;

public class ABC {

	static int a = 0;
	int b = 0;

	ABC() {
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ABC a1 = new ABC();
		ABC a2 = new ABC();
	}
}
