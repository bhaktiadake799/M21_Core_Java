package com.cg.thiskeyword;
//
class B{
	void print(B b) {
		System.out.println("function 1 is invoked");
	}
	void display() {
		print(this);
	}
}
public class methodclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();

	}

}
