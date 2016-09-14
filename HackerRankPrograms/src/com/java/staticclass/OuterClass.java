package com.java.staticclass;

public class OuterClass {

	public static class StaticClass
	{
		public void printMessage()
		{
			System.out.println("Static Class");
		}
	}
	
	public class InnerClass
	{
		public void showMessage()
		{
			System.out.println("Inner Class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	OuterClass.StaticClass staticObject = 	new OuterClass.StaticClass();
	staticObject.printMessage();
	
	OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
	innerObject.showMessage();
	}

}
