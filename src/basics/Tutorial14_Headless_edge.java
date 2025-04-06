package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Tutorial14_Headless_edge {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeOptions opt = new EdgeOptions();
		
		opt.addArguments("--headless");
		
		WebDriver driver = new EdgeDriver(opt);
		
		driver.get("https://www.instagram.com");
		
		driver.manage().window().maximize();
		
		String actual_title = driver.getTitle();
		
		System.out.println(actual_title);
		
		String actual_url = driver.getCurrentUrl();
		
		System.out.println(actual_url);
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
