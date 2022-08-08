package com.cg.set;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
		obj.add("Shiwani");
		obj.add(1);
		obj.add(3.5f);
//		to extract the element of a set separetly.
		Object[]arr=obj.toArray();
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
