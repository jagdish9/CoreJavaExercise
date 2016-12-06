package com.java.basic.tricky;

interface Y_01
{
	int i = 10;
}

abstract class X_01
{
	int i = 10;
}
public class Test01 extends X_01 implements Y_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(i);    // the field i is ambigous
	}

}
