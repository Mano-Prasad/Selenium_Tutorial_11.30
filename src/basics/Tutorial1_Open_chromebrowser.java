package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial1_Open_chromebrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
		
	

	}

}
