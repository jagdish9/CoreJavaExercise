package com.java.string;

public class StringBuilder01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str1 = new StringBuilder("start");
		str1 = str1.append("le");
		System.out.println(str1);
		str1 = str1.insert(4, "le");
		System.out.println(str1);
	}

}
