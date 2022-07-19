package com.cg.superkeyword.java;
class Flower{
	Flower()
	{
		System.out.println("Flower");
	}
}
class Rose extends Flower{
	Rose()
	{
//		we are invoking parent class constructor.
//		first give preference to constructor call and the print statement.
		super();
		System.out.println("rose is red");
		
	}
}
public class superconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r=new Rose();

	}

}
