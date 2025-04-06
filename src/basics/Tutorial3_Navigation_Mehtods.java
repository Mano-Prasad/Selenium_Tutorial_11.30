package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial3_Navigation_Mehtods {
	
	//Naviagtion methods --> to(), back(), forward(), refresh()

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.instagram.com");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
