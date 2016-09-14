package com.java.tricky.inheritance;

class X07
{
    public X07(int i)
    {
        System.out.println(1);
    }
    
 /*   public X07()
    {
        System.out.println(1);
    } */
}
 
class Y07 extends X07
{
    public Y07()
    {
    	super(20);
        System.out.println(2);
    }
}

public class MainClass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
