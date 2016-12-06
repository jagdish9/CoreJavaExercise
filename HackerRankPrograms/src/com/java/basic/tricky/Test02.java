package com.java.basic.tricky;

abstract class Base
{
	public abstract void set();
	
	private Base()
	{
		System.out.println("Private Constructor");
	}
	
	static class Derived extends Base
	{
		public void set()
		{
			System.out.println("set() method implemented");
		}
	}
}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
