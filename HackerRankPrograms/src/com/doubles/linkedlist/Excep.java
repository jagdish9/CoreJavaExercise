package com.doubles.linkedlist;

public class Excep {

	 private int var;
     public Excep(int num)
     {
            //code for parameterized one
            var = num;
     }
     public int getValue()
     {
             return var;
     }
     public static void main(String args[])
     {
             Excep obj2 = new Excep();
             Excep obj1=  new Excep(0);
             System.out.println("var is: "+obj2.getValue());
             System.out.println("var is: "+obj1.getValue());
     }
}
