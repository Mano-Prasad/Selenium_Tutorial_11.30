package TestNG_Annotations2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb2 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@Test
	public void verifyTitle()
	{
		String actual_title = driver.getTitle();
		
		System.out.println(actual_title);
	}
	
	@Test
	public void verifyUrl()
	{
		String actual_url = driver.getCurrentUrl();
		
		System.out.println(actual_url);
	}
	
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
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.close();
	}

}
