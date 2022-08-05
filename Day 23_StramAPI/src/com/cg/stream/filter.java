package com.cg.stream;

import java.util.Arrays;
import java.util.List;

public class filter {

	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(1.5f,112.34f,9.8f);
		System.out.println(obj);
		obj.stream().filter(i->i>15.9f).forEach(System.out::println);
		
	}

}
