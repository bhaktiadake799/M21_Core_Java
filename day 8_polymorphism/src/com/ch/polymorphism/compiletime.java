package com.ch.polymorphism;
class A{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
}
public class compiletime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.add(2, 5);
		obj.add(3.0f, 9.0f);

	}

}
