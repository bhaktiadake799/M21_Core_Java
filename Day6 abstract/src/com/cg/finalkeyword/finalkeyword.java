package com.cg.finalkeyword;
final class vehicle{
	void display() {
		System.out.println("vehicle type");
	}
}
class Bike extends vehicle
{
	void print()
	{
		System.out.println("bike");
	}
}
public class finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.print();
		b.display();

	}

}
