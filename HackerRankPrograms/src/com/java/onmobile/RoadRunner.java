package com.java.onmobile;

public class RoadRunner implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoadRunner run1 = new RoadRunner();
		run1.run();
		new Thread(run1).start();
		new Thread(run1).run();
		new Thread(run1).start();
	}

	public void run()
	{
		System.out.println("Thread Name..."+Thread.currentThread().getName());
	}
}
