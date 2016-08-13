package com.java.StringAndArray;
class S12 implements Runnable
{
  public void run()
  {
    System.out.println(Thread.currentThread().getName());
  }
  
  public static void main(String... args)
  {
    S2 s =  new S2();
	Thread t = new Thread(s);
	t.setName("good");
	t.start();
  }
}