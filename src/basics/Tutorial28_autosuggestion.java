package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial28_autosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> al = driver.findElements(By.xpath("//div[@id='Alh6id']/div[1]/div/ul/li"));
		
		System.out.println(al.size());
		
		/*for(WebElement  aa  : al)
		{
			System.out.println(aa.getText());
		}*/
		
		
		for(WebElement  xx   : al)
		{
			if(xx.getText().equals("selenium ide"))
			{
				
				Thread.sleep(5000);
				
				xx.click();
				
				Thread.sleep(5000);
				
				break;
			}
		}

	}

}
