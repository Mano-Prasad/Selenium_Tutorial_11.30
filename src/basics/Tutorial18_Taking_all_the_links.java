package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial18_Taking_all_the_links {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		
		System.out.println(all_links.size());
		
		/*for(int i=0; i<all_links.size(); i++)
		{
			String link = all_links.get(i).getDomAttribute("href");
			
			System.out.println(link);
		}*/

		
		/*for(int i=0; i<all_links.size(); i++)
		{
			String link = all_links.get(i).getText();
			
			System.out.println(link);
		}*/
		
		
		for(int i =0; i<all_links.size(); i++)
		{
			String text = all_links.get(i).getText();
			
			String link = all_links.get(i).getDomAttribute("href");
			
			System.out.println(link +" -->"+ text);
		}
	}

}
