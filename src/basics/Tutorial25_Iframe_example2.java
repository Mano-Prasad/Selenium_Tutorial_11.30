package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial25_Iframe_example2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		driver.manage().window().maximize();
		
		String text1 = driver.findElement(By.xpath("//a[text()='Enterprise Email']")).getText();
		
		System.out.println(text1);
		
		
		
		//driver.switchTo().frame("moneyiframe"); //id or name
		
		// driver.switchTo().frame(0); //index
		
		WebElement frame_bse = driver.findElement(By.xpath("//iframe[@title='Rediff Money Widget']"));
		
		driver.switchTo().frame(frame_bse);
		
		String text3 = driver.findElement(By.xpath("//span[text()='BSE']")).getText();
		
		System.out.println(text3);
		
		
		driver.switchTo().defaultContent();

		String text2 = driver.findElement(By.xpath("//a[text()='Money'][@class='linkcolor bold']")).getText();
		
		System.out.println(text2);
		

	}

}
