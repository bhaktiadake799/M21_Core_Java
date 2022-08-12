package com.cg.testing;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram {

	@Test
	@DisplayName("Test is cmpleted")
	void function()
	{
		System.out.println("Want to travel");
	}
	@Test
	@Disabled("Not completed")
	void function1()
	{
		System.out.println("false");
	}
}