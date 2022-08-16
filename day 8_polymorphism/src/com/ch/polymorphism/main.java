package com.ch.polymorphism;
// method overloading
class Parent
{
	void m1()
	{
		System.out.println("parent-m1");
	}
}
public class main extends Parent {
	void m1()
	{
		System.out.println("child-m1");
	}
	void m2()
	{
		System.out.println("child m2");
	}

	public static void main(String[] args) {
		Parent p = new main();
		p.m1();
		main m = new main();
		m.m2();
		
		

	}

}
