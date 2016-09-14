package com.java.abstractfactory.design.pattern;

public class ShapeFactory extends AbstractFactory  {

	@Override
	public Shape getShape(String shape) {
		
		if(shape == null)
			return null;
		
		if(shape.equalsIgnoreCase("circle"))
			return new Circle();
		else if(shape.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		else if(shape.equalsIgnoreCase("square"))
			return new Square();
		
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
