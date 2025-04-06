package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath --> text(), contains text(),  starts-with text()

public class Tutorial8_Xpath_Example3 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		System.out.println("==== Text() Function====");
		
		String fp1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		
		System.out.println("Using X-path text function = "+ fp1);
		
		System.out.println("====Contains Text() Function=====");
		
		String fp2 = driver.findElement(By.xpath("//a[contains(text(),'rd')]")).getText();
		
		System.out.println("Using X-path contains text function = "+ fp2);
		
		
		System.out.println("====Starts-with Text() Function===");
		
		String fp3 = driver.findElement(By.xpath("//a[starts-with(text(),'Fo')]")).getText();
		
		System.out.println("Using X-path starts-with text function = "+ fp3);
	}

}
