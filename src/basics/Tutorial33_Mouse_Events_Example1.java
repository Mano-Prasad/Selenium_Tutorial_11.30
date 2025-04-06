package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Mouse Hover

public class Tutorial33_Mouse_Events_Example1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(5000);
		
		WebElement jobs_link = driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(jobs_link).build().perform();;
		
	}

}
