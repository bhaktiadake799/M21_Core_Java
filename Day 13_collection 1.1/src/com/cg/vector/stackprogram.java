package com.cg.vector;

import java.util.Stack;

public class stackprogram {

	public static void main(String[] args) {
//	 push method is used to add the element into stack
		Stack s=new Stack();
		s.push(12);
		s.push("Shruti");
		System.out.println(s);
//	  pop method is used to delete the element into stack

		s.pop();
		System.out.println(s);

	}

}
