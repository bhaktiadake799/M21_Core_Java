package com.cg.anotation;
class Animal
{
	Animal()
	{
	System.out.println("Cat");
}
	public void sound()
	{
		System.out.println("Roars");
	}
}
public class supreesed {

	public static void main(String[] args) {
//		will remove compile warning
		@SuppressWarnings("Unused")
		Animal a=new Animal();
		
	}
		
	}


