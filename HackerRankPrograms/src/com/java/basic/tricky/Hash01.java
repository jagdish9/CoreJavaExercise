package com.java.basic.tricky;

class Key01
{
	public void display()
	{
		System.out.println("display() method");
	}
}
public class Hash01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Key01 k = new Key01();
		int hash = k.hashCode();
		System.out.println(hash);
		int n = 16;
		int index = hash & (n-1);
		System.out.println(index);
	}

}
