package com.cg.list;
import java.util.Scanner;
import java.util.ArrayList;
public class userinput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str);
		Scanner token = new Scanner(str);
		token.useDelimiter(" ");
//		user - input Arraylist 
		ArrayList<Object>arr=new ArrayList<Object>();
//		to return the element of the array
		while (token.hasNext())
		{
			arr.add(token.next());
			System.out.println(arr.get(arr.size()-1));
		}
		System.out.println(arr);
		
		

	}

}
