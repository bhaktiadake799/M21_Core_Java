package com.cg.lambda;
//functional interface
interface A
{
//	zero-parameter abstract method.
	void show();
}
class B implements A
{
	@Override
	public void show()
	{
		System.out.println("Program on to implement functional interfavce");
	}
}
public class functionalinterface {

	public static void main(String[] args) {
//		lambda expression
		A obj=()->
		{
			System.out.println("program on to inplement functional interface using lambda");
			
		};
		obj.show();
		

	}

}
