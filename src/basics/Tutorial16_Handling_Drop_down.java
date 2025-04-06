package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tutorial16_Handling_Drop_down {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("new account")).click();
		
		WebElement month_dd = driver.findElement(By.id("month"));
		
		Select sel = new Select(month_dd);
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
		Thread.sleep(5000);
		
		sel.selectByVisibleText("Sep");
		
		Thread.sleep(5000);
		
		sel.selectByValue("12");
		
		Thread.sleep(5000);
		
		sel.selectByIndex(2);
		
		Thread.sleep(5000);
		
		sel.selectByContainsVisibleText("Ju");
		
		
		
	}

}
