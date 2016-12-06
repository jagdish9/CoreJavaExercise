package com.java.executor;

import java.util.HashMap;

public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String, Integer> map =  new HashMap<String, Integer>();
       String str1 = "abcdef";
       String str2 = "wxyzk";
       String str3 = "lmnopq";
       System.out.println(str1.hashCode());
       System.out.println(str2.hashCode());
       System.out.println(str3.hashCode());
       
       map.put("abcdef", 10);
       map.put("wxyzk", 20);
       map.put("lmnopq", 30);
	}

}
