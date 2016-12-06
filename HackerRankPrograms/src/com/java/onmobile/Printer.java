package com.java.onmobile;

public class Printer {

	public void print()
	{
		System.out.println("print()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer  print = new CopyPrinter();
		print.print();
	}

}
