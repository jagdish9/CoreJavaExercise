package com.java.StringAndArray;
public class Demo2 extends Thread
{
   public void run()
   {
     synchronized(this)
	 {
	   try
	   {
	     wait(6000);
	   }
	   catch(InterruptedException ie)
	   {
	    ie.printStackTrace();
	   }
	 }
   }
   
   public static void main(String[] args)
   {
     Demo2 d = new Demo2();
	 long startTime = System.currentTimeMillis();
	 System.out.println(startTime);
	 d.start();
	 try{
	    d.join(6000);
	 }
	 catch(InterruptedException ie)
	 {
	   ie.printStackTrace();
	 }
	 
	 System.out.println(System.currentTimeMillis() - startTime);
   }
}