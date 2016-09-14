package com.java.basic;

public class E01Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcabcab";
		String[] s = str.split("c");
		for(int i =0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		
	}

}
