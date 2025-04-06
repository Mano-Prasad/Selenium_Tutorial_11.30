package TestNG_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClass_and_AfterClass 
{
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Close the browser");
	}
	
	@BeforeClass
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

	
}
