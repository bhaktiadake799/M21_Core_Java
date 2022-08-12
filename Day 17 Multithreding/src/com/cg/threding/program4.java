package com.cg.threding;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}

public class program4 {

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
		System.out.println("Is thread interrupted ? "+t.isInterrupted());
		t.interrupt();
		System.out.println("Is thread interrupted ? "+t.isInterrupted());
	}
}
