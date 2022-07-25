package com.cg.string;
import java.util.Scanner;
public class inputstring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "Dhoni";
		String s = in.next();
		if(str.equals(s)){
			System.out.print("Matching");
		}
		else{
			System.out.print("Not matching");
			}
		}
	}
