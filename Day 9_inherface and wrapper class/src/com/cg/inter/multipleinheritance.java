package com.cg.inter;
interface Mother
{
	void display();
}
interface father
{
	void print();

}
 class Daughter implements Mother, father
{
	@Override
	public void print() {
		System.out.print("My father name is Jagdish ");
	}
	@Override
	public void display()
	{
		System.out.println("My mother name is Nayana");
	}
	
	}
public class multipleinheritance {

	public static void main(String[] args) {
		Daughter d= new Daughter();
		d.display();
		d.print();

	}

}
