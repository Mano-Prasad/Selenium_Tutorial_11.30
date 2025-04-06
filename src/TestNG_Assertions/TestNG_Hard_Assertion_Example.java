package TestNG_Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Hard_Assertion_Example 
{
	
	WebDriver driver;
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	
	}

	
	@Test
	public void verify_Female_radio_btn()
	{
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//input[@class='_8esa' and @value='1' ]"));
		
		
		System.out.println("Testcase1 start");
		
		boolean r1 = ele.isDisplayed();
		
		Assert.assertEquals(r1, true);
		
		System.out.println("Testcase1 end");
		
		
		System.out.println("Testcase2 start");
		
		boolean r2 = ele.isEnabled();
		
		Assert.assertEquals(r2, false);
		
		System.out.println("Testcase2 end");
		
		
		System.out.println("Testcase3 start");
		
		boolean r3 = ele.isSelected();
		
		Assert.assertEquals(r3, false);
		
		System.out.println("Testcase3 end");
		
		
		ele.click();
		
		
		System.out.println("Testcase4 start");
		
		boolean r4 = ele.isSelected();
		
		Assert.assertEquals(r4, true);
		
		System.out.println("Testcase4 end");
	}
	
}
