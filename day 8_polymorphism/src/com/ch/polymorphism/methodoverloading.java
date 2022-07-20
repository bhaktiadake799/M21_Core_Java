package com.ch.polymorphism;
class shape
// method overloading
//by chamging number of argument.
{
	int area (int a)
	{
		return a*a;
	}
	int area(int a,int b)
	{
		return a*b;
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new shape();
		System.out.println(s.area(9));
		System.out.println(s.area(6, 9));

	}

}
