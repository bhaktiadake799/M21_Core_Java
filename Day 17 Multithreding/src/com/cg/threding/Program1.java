package com.cg.threding;

public class Program1 extends Thread {
	public void run()
	{
		System.out.println("Thread is going to run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p=new Program1();
		p.start();
	}

}
