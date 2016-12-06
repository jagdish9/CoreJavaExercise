package com.java.onmobile;

public class SumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new SumValue().sum(16, 0));
	}

	public int sum(int a, int b)
	{
		try
		{
		  System.out.println("Sum is: ");
		  return a%10 + b%10;
		}
		catch(ArithmeticException we)
		{
	       we.printStackTrace();
		}
		finally
		{
			return a+b;
		}
	}
}
