package com.cg.finalkeyword;
class C
{
	void accept() {
	System.out.println("Hey there, i wanna provide restriction");
	}
}

class D extends C
{
	void accept()
	{
		System.out.println("restriction provided");
		
	}
}
public class finalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
		d.accept();
		

	}

}
