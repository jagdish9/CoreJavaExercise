package com.java.basic.tricky;

final class Demo01
{
	public void display()
	{
		System.out.println("display() method");
	}
}

class Demo02
{
	public void display()
	{
		System.out.println("display() method");
	}
	
	public Demo02()
	{
		
	}
}

public class Test03 extends Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
