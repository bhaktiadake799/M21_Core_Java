package com.cg.exception;
// program on throw keyword
// throw keyword is used to throw an exception explicitly.
public class throwkeyword {
	public static void validate(int age)
	{
		if (age<21||age>27)
			throw new ArithmeticException("not eligible");
		else
			System.out.println("eligble to attend military section");
	}

	public static void main(String[] args) {
		try
		{
			validate(30); 
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code.");
}
}
