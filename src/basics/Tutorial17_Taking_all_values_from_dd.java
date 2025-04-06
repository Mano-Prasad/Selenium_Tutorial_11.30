package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tutorial17_Taking_all_values_from_dd {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@id,'_0_0_')]")).click();
		
		WebElement year_dd = driver.findElement(By.id("year"));
		
		Select sel = new Select(year_dd);
		
		List<WebElement> my_list = sel.getOptions();
		
		System.out.println(my_list.size());
		
		Iterator<WebElement> it = my_list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
	}

}
