package com.cg.inhertitance;
//Program for SingleInheritance:
class Bike
{
	public int speed=20;
	void Speed()
	{
		System.out.println("The speed of bike is:"+speed);
	}
}
class Pulse extends Bike
{
	public int speed=70;
	void average()
	{
		System.out.println("Average is fine");
	}
}
public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulse p1=new Pulse();
		p1.Speed();
		p1.average();
	}
}

