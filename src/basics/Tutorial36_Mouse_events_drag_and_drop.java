package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tutorial36_Mouse_events_drag_and_drop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(5000);
		
		WebElement f1 = driver.findElement(By.cssSelector(".demo-frame"));
		
		driver.switchTo().frame(f1);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver, Duration.ofSeconds(5));
		
		act.dragAndDrop(e1, e2).build().perform();
	}

}
