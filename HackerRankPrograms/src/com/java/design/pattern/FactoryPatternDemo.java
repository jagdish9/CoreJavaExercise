package com.java.design.pattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeFactory sf = new ShapeFactory();
		
		Shape shape1 = sf.getShape("circle");
		shape1.draw();
		
		Shape shape2 = sf.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = sf.getShape("square");
		shape3.draw();
	}

}
