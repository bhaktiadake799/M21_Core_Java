package com.cg.exception;
import java.util.Scanner;
public class finalblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		try
		{
			int res=15/x;
			System.out.println(res);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception handler");
		}
		finally
		{
			System.out.println("whether any exception occur or not, the finally block is alway executed");
		}

	}

}
