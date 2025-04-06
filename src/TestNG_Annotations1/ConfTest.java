package TestNG_Annotations1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ConfTest 
{
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Open the browser");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Close the browser");
	}

}
