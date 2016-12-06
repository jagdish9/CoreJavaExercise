package com.java.basic;

	class A1
	{ }
	class B1 extends A1
	{ }

	class Equality {
	    int x;
	    int y;
	    boolean isequal() {
	        return(x == y);
	    }
	}
	
	class Base{
	    int value = 0;
	    Base(){
	        addValue();
	    }
	    void addValue(){
	        value += 10;
	    }
	    int getValue(){
	        return value;
	    }
	}
	class Derived extends Base{
	    Derived(){
	        addValue();
	    }
	    void addValue(){
	        value +=  30;
	    }
	}
	
public class Test_01 {

	/*public static void main(String[] a)
	{
	/*	Equality obj = new Equality();
        obj.x = 10;
        obj.y = 10;
    System.out.println(obj.isequal());     */
		
		
	//}
	
	public static void call(Exception e)
    {
        System.out.println("Exception");
    }
    public static void call(NullPointerException e)
    {
        System.out.println("NullPointer");
    }
    public static void call(Object e)
    {
        System.out.println("Object");
    }
    public static void main(String args[])
    {
        //call(null);
    	
    	Derived b= new Derived();
        System.out.println(b.getValue());
    }

	
}
