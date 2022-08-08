package com.cg.generics;

public class genericClass<T> {
	T num;
	public void display()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericClass<Character>obj=new genericClass<Character>();
		obj.num = 15;
		obj.display();

	}

}
