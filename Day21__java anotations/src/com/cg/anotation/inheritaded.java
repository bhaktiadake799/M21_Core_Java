package com.cg.anotation;
import java.lang.annotation.*;
import java.lang.reflect.Method;
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
//custom annotation
@interface Custom1
{
//	abstract class
//	single -value annotation
	String print();
}
class D
{
	@Custom1(print="Bhakti")
	public void display()
	{
		System.out.println("'Display inheritance");
	}
}
class E extends D
{
	public void display1()
	{
		System.out.println("'Display inheritance : 1");
	}
}
public class inheritaded {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException{
	
		E obj=new E();
		obj.display();
		obj.display();
		Method m= obj.getClass().getMethod("display");
		Custom1 obj1=m.getAnnotation(Custom1.class);
		System.out.println(obj1.print());
		

	}

}
