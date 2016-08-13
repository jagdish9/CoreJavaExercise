package com.java.interview;

public class ChildClass extends MyBaseClass {

	public void disp() {
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass cs = new ChildClass();
		cs.disp();
	}

}
