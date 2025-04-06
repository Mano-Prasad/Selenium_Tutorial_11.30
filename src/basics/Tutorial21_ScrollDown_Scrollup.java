package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial21_ScrollDown_Scrollup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,2000)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scroll(0,-2000)");
	}

}
