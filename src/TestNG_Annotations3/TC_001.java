package TestNG_Annotations3;

import org.testng.annotations.Test;

public class TC_001 extends Conftest
{
	
	@Test
	public void verifyTitle()
	{
		String actual_title = super.driver.getTitle();
		
		System.out.println(actual_title);
	}
	
	@Test
	public void verifyUrl()
	{
		String actual_url = super.driver.getCurrentUrl();
		
		System.out.println(actual_url);
	}
	

}
