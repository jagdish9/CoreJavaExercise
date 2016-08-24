package com.java.string;

public class StringBuffer01 {

	public static void main(String[] args)
	{
		StringBuffer str1 = new StringBuffer("start");
		str1 = str1.append("le");
		System.out.println(str1);
		str1 = str1.insert(4, "le");
		System.out.println(str1);
	}
}
