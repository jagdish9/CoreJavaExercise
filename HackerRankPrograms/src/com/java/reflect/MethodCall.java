package com.java.reflect;

import java.lang.reflect.Method;

public class MethodCall {

	private static final String cs = "com.java.reflect.A";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class c = Class.forName(cs);
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("message", null);
		m.setAccessible(true);
		m.invoke(o, null);
	}

}
