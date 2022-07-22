package com.cg.array;
import java.util.Scanner;
public class twoDuserinputarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int m=s.nextInt();
		System.out.println("Enter the size of array: ");
		int n=s.nextInt();
		int arr[][]=new int[m][n];
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				System.out.println("enter "+i+" "+j+" value: ");
				arr[i][j]=s.nextInt();
			}
		}
		// TODO Auto-generated method stub
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
		}

	}

}
