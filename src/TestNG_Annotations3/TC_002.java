package TestNG_Annotations3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_002 extends Conftest
{
	
	@Test
	public void verfiyhomepageText()
	{
		String hpText = driver.findElement(By.cssSelector("._8eso")).getText();
		
		System.out.println(hpText);
	}
	
	
	@Test
	public void verifyForgottenpassword()
	{
		String forgottenText = driver.findElement(By.partialLinkText("ten")).getText();
		
		System.out.println(forgottenText);
	}
	
	@Test
	public void verifySignuplink()
	{
		String sigupText = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getText();
		
		System.out.println(sigupText);
	}

}
