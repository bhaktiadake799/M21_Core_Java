package com.cg.thiskeyword;
//this keyword can be passes as an argument in the constructor call
class A{
	public int a;
	A(){
		
	}
	A(int a){
		this.a=a;
	}
}
public class constructorargument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A(5);
		System.out.println("The value of A is "+obj.a);

	}

}
