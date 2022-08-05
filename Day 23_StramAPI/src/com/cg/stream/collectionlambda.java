package com.cg.stream;

import java.util.LinkedList;

public class collectionlambda {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(1);
		obj.add(12);
		System.out.println(obj);
		obj.forEach(i-> System.out.println(i));
			
		}
	}


