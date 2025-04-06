package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial22_Handling_radio_btn {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebElement female_radio = driver.findElement(By.xpath("//input[@class='_8esa'][@value='1']"));
		
		boolean f1 = female_radio.isDisplayed();
		
		System.out.println("Female radio button isdisplay = "+ f1);

		
		boolean f2 = female_radio.isEnabled();
		
		System.out.println("Feamale radio button isenable= "+ f2);
		
		
		
		boolean f3 = female_radio.isSelected();
		
		System.out.println("Female radio button isSelected = "+ f3);
		
		
		female_radio.click();
		
		
		boolean f4 = female_radio.isSelected();
		
		System.out.println("After clicking female radio button isSelected = "+ f4);
	}

}
