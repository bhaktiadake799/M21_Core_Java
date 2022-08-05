package com.cg.lambda;
interface D
{
	String show(String str1, String str2);
}
public class lambdaExp {

	public static void main(String[] args) {
		D obj=(String a, String b)->(a+b);
		System.out.println("String are: "+obj.show("Siya"," "+"riya"));

	}

}
