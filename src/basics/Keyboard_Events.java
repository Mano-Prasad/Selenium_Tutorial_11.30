package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Events {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("firstName")).sendKeys("Ram");
		
		Actions act = new Actions(driver, Duration.ofSeconds(30));
		
		act.sendKeys(Keys.TAB).
		sendKeys("K").
		sendKeys(Keys.TAB)
		.sendKeys("9383848758").
		sendKeys(Keys.TAB).
		sendKeys(Keys.SPACE).
		sendKeys(Keys.SPACE).
		sendKeys(Keys.SPACE).
		sendKeys("ram@gamil.com").
		sendKeys(Keys.TAB).
		sendKeys("chennai").
		sendKeys(Keys.BACK_SPACE).build().perform();
	}

}
