package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial27_Multiple_Window_Handling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("new acc")).click();
		
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent window title = "+ driver.getTitle());
		
		driver.findElement(By.id("terms-link")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		
		
		for(String child   : childWindow)
		{
			if(!parentWindow.equals(child))
			{
				driver.switchTo().window(child);
				
				Thread.sleep(3000);
				
				System.out.println("Child window title =" + driver.getTitle());
				
				String child_win_text = driver.findElement(By.xpath("//h2/span[text()='Terms of Service']")).getText();
				
				System.out.println("Child window text = "+ child_win_text);
				
				//driver.close();
			}
		}
		
	/*	driver.switchTo().window(parentWindow);
		
		driver.findElement(By.name("firstname")).sendKeys("Ram");
		
		Thread.sleep(5000);
		
		//driver.close();
		
		driver.quit();
		*/
		
	}

}
