package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial6_Xpath_Example1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("JavaSelenium");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("JavaScriptSelenium");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("PythonSelenium");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
	}

}
