package com.cg.superkeyword.java;
//super keyword- it is used to access parent class method
class Animal{
	public int a=10,b=20;
	public void display()
	{
		System.out.println("The addition of a and b is: "+(a+b));
	}
}
class tiger extends Animal{
	public void display()
	{
		System.out.println("Tiger");
	}
	void print()
	{
		display();
		super.display();
	}
}
public class supermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiger t=new tiger();
		t.print();

	}

}
