package com.cg.exception;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		try {
		int res =15/x;
		System.out.println(res);
//		 finally block will not execute if you call below statement.
		System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception handler");
			
		}
		finally {
			System.out.println("where any execption our or not ");
			
		}
		;

	}

}