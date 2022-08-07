package com.cg.inter;
interface vehicle
{
	void speed();
}
interface Car extends vehicle 
{
	void engine();
}
class bus implements Car
{
	public void engine()
	{
		System.out.println("Pertrol");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}
}
public class mainexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bus b=new bus();
		b.engine();
				

	}

}
