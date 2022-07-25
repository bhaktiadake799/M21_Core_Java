package com.ass;
import java.util.Scanner;
public class Main {
	static int FindSum(int number)
	{
		return number == 0 ? 0: number %10 + FindSum(number /10);
	}
	public static void main(String[] args) {
		int number=120;
					System.out.println(FindSum(number));
	}

}
