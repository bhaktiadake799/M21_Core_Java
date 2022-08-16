package com.cg.Enum1;

enum Bike
{
	KTM,Unicorn,Duo,Splendour;
}

public class Prog3 {

	public static void main(String[] args) {
		Bike b = Bike.KTM;
		switch(b)
		{
		case Duo:
			System.out.println("You choose Duo");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case Splendour:
			System.out.println("You choose Splendour");
			break;
		case Unicorn:
			System.out.println("You choose Unicorn");
			break;
			
		default:
			System.out.println("Invalid Case");
		}

	}

}