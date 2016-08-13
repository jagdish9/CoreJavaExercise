package com.java.reflect;

import java.lang.reflect.Method;

public class MethodCall3 {

	private static final String cs = "com.java.reflect.A";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class c = cs.getClass();
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("cube", new Class[] { int.class });
		m.setAccessible(true);
		m.invoke(o, 7);
	}

}
