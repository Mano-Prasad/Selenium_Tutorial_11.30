package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial15_Handling_alert_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@title,'user')]")).click();
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		String alertPopup_text = alt.getText();
		
		System.out.println(alertPopup_text);
		
		alt.accept(); //Click on Ok button
		
		//alt.sendKeys("This is alert popup"); //inserting a text in alert text box
		
		//alt.dismiss();  //Click on cancel button
		

	}

}
