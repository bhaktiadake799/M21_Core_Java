package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class genericsecample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>Obj=new LinkedList<Integer>();
		Obj.add(11);
		Obj.add(12);
//		 1,3 compile time checking and type safe 
		System.out.println(Obj);
		
		List<String>Obj1 = new LinkedList<String>();
//		 2.type casting is not required in generics
		Obj1.add("Aakanksha");
		Obj1.add("Diksha");
		String str = Obj1.get(1);
//		typecasting explicitly if there is not an object type
//		string str1=(string)obj1.get(1);
		System.out.println(str);
		
		

	}

}
