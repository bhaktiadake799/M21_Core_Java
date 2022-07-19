package com.cg.superkeyword.java;
// super keyword - it is used to acess parent class instance variable.
class Mobile{
	protected String name="Samsung";

}
class Samsung extends Mobile
{
	String name="Galaxy m31s";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class supervariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s=new Samsung();
		s.display();

	}

}
