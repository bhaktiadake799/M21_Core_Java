package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class basicstream {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Bhakti","Shruti","Omkar","Manas");
		obj.forEach((i)-> System.out.println(i));
		List<String> obj1=Arrays.asList(new String[]{"Pune","Mumbai","Nashik"});
//		obj=obj1.Stream();
		obj1.forEach(System.out::println);
		
		

	}

}
