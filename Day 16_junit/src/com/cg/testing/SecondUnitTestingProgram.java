package com.cg.testing;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram {
	
	@Test
	@BeforeAll
	static void display()
	{
		System.out.println("@BeforeAll -Executes once Before all the Test Methods in this class");
	}
	@Test
	@BeforeEach
	void display1()
	{
		System.out.println("BeforeEach -Executes Before each Test Method in this class");
	}
	
	@Test
	void print()
	{
		System.out.println("Hello");
	}
	@Test
	void print1()
	{
		System.out.println("Hello guys");
	}
}