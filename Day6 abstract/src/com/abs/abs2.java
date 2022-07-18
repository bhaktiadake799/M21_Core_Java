package com.abs;
abstract class A{
	void print()
	{
		System.out.println("Non-abstract method");
		
	}
}
class B extends A{
//	As B is inheritance the properties of A class then it has print method
}
public class abs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.print();

	}

}
