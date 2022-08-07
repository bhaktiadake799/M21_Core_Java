package com.cg.inter;
interface inff
{
	void display();
}
class demo implements inff{
	public void display()
	{
		System.out.println("Interface");
	}
	
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d =new demo();
		d.display();

	}

}
