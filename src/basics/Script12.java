package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script12 {

	public static void main(String[] args) {

		
        ChromeOptions opt = new ChromeOptions();
		
	    opt.addArguments("--headless");
		
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://jquery.com/");
		
		driver.manage().window().maximize();
		
	    List<WebElement> all_links	= driver.findElements(By.tagName("a"));
	    
	    System.out.println("Totall number of links = "+ all_links.size());
	    
	    Iterator<WebElement> it = all_links.iterator();
  
	    while(it.hasNext())
	    {	    	
	    	String text = it.next().getText();
	    	System.out.println(text);
	    }
	    
/*		for(int i=0; i<all_links.size(); i++)
		{
			String link = all_links.get(i).getText();
			
			System.out.println(link);
		}


*/
	}

}
