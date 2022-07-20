package com.ch.polymorphism;
//constructor overloading
class Triber{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("renualt-kiger");
	}
	Triber(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		
	}
}
public class constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triber t=new Triber();
		Triber t1=new Triber(45,"disel");

	}

}
