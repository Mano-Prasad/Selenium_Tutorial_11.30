package TestNG_Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Attributes_Example1 
{
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
	}
	
	@Test(priority = 3)
	public void verifyTitle()
	{
		String actual_title = driver.getTitle();
		
		Assert.assertEquals(actual_title, "OrangeHR");
	}
	
	@Test(priority = 1)
	public void verifyUrl()
	{
		String actual_url  = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 2, enabled = false)
	public void verifyLogoispresent()
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".orangehrm-login-branding")));
		
		boolean actual_res = driver.findElement(By.cssSelector(".orangehrm-login-branding")).isDisplayed();
		
		//Assert.assertEquals(actual_res, true);
		
		Assert.assertTrue(actual_res);
	}
	
	@Test(priority = 6, description = "Check the login title")
	public void verifyLoginheading()
	{
		String actual_login_title = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		
		Assert.assertEquals(actual_login_title, "Login");
	}
	
	
	@Test (priority = 5, dependsOnMethods = {"verifyUrl","verifyTitle"}, alwaysRun = true)
	public void verifyUser_name_label()
	{
		String actual_un_label_text = driver.findElement(By.xpath("//label[text()='Username']")).getText();
		
		Assert.assertNotEquals(actual_un_label_text,"Username");
	}
	
	@Test (priority = 4, invocationCount = 5, invocationTimeOut = 840 )
	public void verifyPassword_label()
	{
		String actual_pass_label_text = driver.findElement(By.xpath("//label[text()='Password']")).getText();
		
		Assert.assertEquals(actual_pass_label_text, "Password");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
