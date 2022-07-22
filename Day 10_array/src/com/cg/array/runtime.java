package com.cg.array;
import java.util.Scanner;
public class runtime {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
//to enter elements in array
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("enter" + i+"value");
			arr[i]=s.nextInt();
		}
		for (int x:arr)
		{
			System.out.print(x+" ");
			
		}
	}

}
