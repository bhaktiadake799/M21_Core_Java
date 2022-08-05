package com.cg.lambda;
interface C
{
//	one parameter abstract method
	int print(int n);
}
/*Class D implements C
{
	public int print(int n)
	{
		System.out.println("Program on to implement one parameterized");
		return n;
		
	}
}*/
     
public class oneParameter {

	public static void main(String[] args) {
		C obj1=(int n)->
		{
			return n;
		};
		System.out.println(obj1.print(5));
		

	}

}
