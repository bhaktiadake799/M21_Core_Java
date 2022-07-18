package com.abs;
//program for abstract class
abstract class Fruit
{
//	abstract method
	abstract void display();
}
class apple
{
	void display()
	{
		System.out.println("Apple is good for our brain");
	}
}
public class abclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		we cannot create the obj. for abstract class.
		apple f=new apple();
		f.display();

	}

}
