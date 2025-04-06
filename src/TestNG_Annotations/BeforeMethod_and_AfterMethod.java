package TestNG_Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_and_AfterMethod 
{
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Open the browser");
	}
	
	@Test
	public void m1()
	{
		System.out.println("Test case1");
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

	@AfterMethod
	public void tearDown()
	{
		System.out.println("Close the browser");
	}
}
