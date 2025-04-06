package TestNG_Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest_and_AfterTest 
{
	@AfterTest
	public void tearDown()
	{
		System.out.println("Close the browser");
	}
	
	
	@Test
	public void m1()
	{
		System.out.println("Test case1");
	}
	
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("Open the browser");
	}
	@Test
	public void m2()
	{
		System.out.println("Test case2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("Test case3");
	}

	
}
