package com.cg.exception;
import java.io.IOException;
public class throwskeyword
{
	static void display(int x)throws IOException, ClassNotFoundException
	{
		if(x==5)
		{
			throw new IOException("Input-output exception");
		}
		else
		{
			throw new ClassNotFoundException("Class Not found Exception");
		}
	}
	public static void main(String[]args)
	{
		try
		{
			display(7);
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
