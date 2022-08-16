package com.cg.anotation;
//custom annotation
@interface Custom
{
//	abstract method
	String print();
	
	}
class B
{
	@Custom (print="Hello student")
	public void disply()
	{
		System.out.println("Assdnbdfjkvs");
	}
}

public class customannotation {

	public static void main(String[] args) {
		B b=new B();
		b.disply();

	}

}
