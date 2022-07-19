package com.cg.thiskeyword;
class Main
{
	int a;
	int b;

//Default constructor
	Main()
	{
		a = 10;
		b = 20;
		}


//Method that returns current class instance

Main get()

{

return this;

}

//Displaying value of variables a and b

void display()
{
	System.out.println("a = " + a + " b = " + b);

}

public static void main(String[] args)

{

Main object = new Main();

object.get().display();

}

}