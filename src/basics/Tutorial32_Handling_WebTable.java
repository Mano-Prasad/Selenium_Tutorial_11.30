package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial32_Handling_WebTable {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//single column
		
		String r1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[6]/td[1]")).getText();
		
		System.out.println("Single column = "+ r1);
		
		//single row
		
		String s2 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[6]")).getText();
		
		System.out.println(s2);
		
		System.out.println("======================");
		
		System.out.println("Entire table");
		
		List<WebElement> li = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for(WebElement  aa  : li)
		{
			System.out.println(aa.getText());
			
			System.out.println("========");
		}
		
		
	}

}
