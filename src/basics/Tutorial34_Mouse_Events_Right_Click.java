package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tutorial34_Mouse_Events_Right_Click {

	
	// Right click or context click
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver, Duration.ofSeconds(10));
		
		act.contextClick(ele).build().perform();
		

	}

}
