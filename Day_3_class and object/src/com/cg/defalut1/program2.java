package com.cg.defalut1;
class B{

	public int roll_no;
	public String name;
	B(String Name,int roll)
	{
		roll_no=roll;
	name=Name;
	}
			void data()
			{
				System.out.println("name: "+ name);
				System.out.println("age "+ roll_no);
			}
}


public class program2 {
	public static void main(String[]args)
	{
		B b1=new B("joe",90);
		b1.data();
	}
}
