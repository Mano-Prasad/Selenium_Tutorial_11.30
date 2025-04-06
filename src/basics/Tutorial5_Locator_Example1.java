package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial5_Locator_Example1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//id
		
		driver.findElement(By.id("email")).sendKeys("JavaSelenium");
		
		Thread.sleep(5000);
		
		//name
		
		driver.findElement(By.name("pass")).sendKeys("Admin@123");
		
		//classname
		
		String f1 = driver.findElement(By.className("_8eso")).getText();
		
		System.out.println(f1);
		
		
		//Link Text
		
		String f2 = driver.findElement(By.linkText("Forgotten password?")).getText();
		
		System.out.println("Link Text = "+ f2);
		
		//Partial link text
		
		String f3 = driver.findElement(By.partialLinkText("got")).getText();
		
		System.out.println("Partial Link Text = "+ f3);
		
		
		String f4 = driver.findElement(By.partialLinkText("Privacy C")).getText();
		
		System.out.println("Partial link text = "+ f4);
		
		
		
		
	}

}
