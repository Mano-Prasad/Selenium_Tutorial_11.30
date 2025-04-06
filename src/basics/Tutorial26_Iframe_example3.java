package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial26_Iframe_example3 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> all_iframe = driver.findElements(By.tagName("iframe"));
		
		System.out.println(all_iframe.size());
		
		for(WebElement aa : all_iframe)
		{
			System.out.println(aa.getDomAttribute("id"));
		}
	}

}
