package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapping {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[]{"Apple","Banana","mango","lichi"});
		System.out.println("Word length for obj-fruit");
		obj.stream().map(String::length).forEach(i->System.out.print(i));
        List<Integer>obj1=Arrays.asList(new Integer[] {1,87,90,54,78});
        List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
        System.out.print(obj2+" ");
	}
	
	}
