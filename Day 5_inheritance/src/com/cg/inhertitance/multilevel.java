package com.cg.inhertitance;
//MultilevelInheritance :
class Car
{
	void CarType()
	{
		System.out.println("working on engine");
	}
}
class Renault extends Car
{
	public String brand="Renault";
	void Brand()
	{
		System.out.println("This is brand "+brand);
	}
}
class KWID extends  Renault
{
	int speed =3000;
	
	void average()
	{
		System.out.println("Average is :"+speed);
	}
}
public class multilevel{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KWID k=new KWID();
		k.average();
		k.Brand();
		k.CarType();
	}
}
