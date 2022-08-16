package com.cg.defalut1;
import java.util.Scanner;
class c
{
	int rollno;
	String name;
	int rollno1;
	String name1;
	
	c(int r,String n)
	{
		rollno=r;
		name = n;
		rollno1=r;
		name1=n;
		
	}
	void print()
	{
		System.out.println("Roll no is: " +rollno +"and name is: "+name);
	}
}
public class userdefineconstructore {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first name and roll no : ");
		int rollno = s.nextInt();
		String name=s.nextLine();
		System.out.println("Enter the second roll no : ");
		int rollno1=s.nextInt();
		String name1=s.nextLine();
		c obj=new c(rollno,name);
		c obj1=new c(rollno1,name1);
		obj.print();
		obj1.print();
		
		s.close();
	}
}
