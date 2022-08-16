package com.abs;
//we cannot make any abstract class as final in java
abstract class Car{
	abstract void display();
	
}
class Audi extends Car
{
	void display()
	{
		System.out.println("Audi");
	}
}
public class finalabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a=new Audi();
	    a.display();

	}

}
