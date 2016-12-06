package com.java.onmobile;

public class RoadRunner01 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoadRunner01 rrun = new RoadRunner01();
		rrun.run();
		Thread t1 = new Thread(rrun);
		Thread t2 = new Thread(rrun);
		t1.start();
		t2.start();
	}

	public void run()
	{
		System.out.println("Thread Name..."+Thread.currentThread().getName());
	}
}
