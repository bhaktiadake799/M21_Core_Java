package com.cg.stream;

import java.util.Arrays;
import java.util.List;

public class streamoperation {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(8,9,89,67,54,83);
		obj.stream().distinct().forEach(System.out::println);
		System.out.println();
        obj.stream().limit(5).forEach(i->System.out.print);
        System.out.println();
	}

}
