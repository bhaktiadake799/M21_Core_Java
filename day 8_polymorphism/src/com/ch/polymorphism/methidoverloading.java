package com.ch.polymorphism;
class Muliplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
}
class Mult extends Muliplication
{
	void accept(int x,int y)
	{
		System.out.println(x*y);
	}
}
public class methidoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mult n=new Mult();
		n.accept(2,5);
		Muliplication m1=new Muliplication();
		m1.accept(4,6);

	}

}
