package com.cg.anotation;
//override annotation givves extra information about the method
class car
{
	public void speed(int s)
	{
		System.out.println("Speed is: "+s+"Km/hr");
	}
}
class BMW extends car
{
	@Override
	 public void speed(int s)
	{
		System.out.println("Speed is: "+s+"Km/hr");
	}
}
public class override {
	public static void main(String args[]) {
		
	BMW b =new BMW();
	b.speed(60);
}
}


	