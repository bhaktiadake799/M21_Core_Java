package com.cg.thread;

public class prog1 extends Thread {
	public void run()
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		prog1 e = new prog1();
		e.start();
	}
}