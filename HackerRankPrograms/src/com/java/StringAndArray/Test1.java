package com.java.StringAndArray;
import java.util.*;

class Demo1
{
  public static synchronized void printName()
   {
   try{
     System.out.println("PrintName");
	 Thread.sleep(5*1000);
	 }
	  catch(InterruptedException e)
	  {
	   e.printStackTrace();
	  }
   }
   
   public synchronized void printValue()
   {
     System.out.println("PrintValue");
   }
}

public class Test1 extends Thread
{
  Demo1 b = new Demo1();
   
   public static void main(String[] args)
   {
     Test1 t = new Test1();
	 Thread t1 = new Thread(t, "t1");
	 Thread t2 = new Thread(t, "t2");
	 t1.start();
	 t2.start();
   }
   
   public void run()
   {
     if(Thread.currentThread().getName().equals("t1"))
	  {
	    Demo1.printName();
		b.printName();
	  }
	 else
	 {
	    b.printValue();
	 }
   }
}