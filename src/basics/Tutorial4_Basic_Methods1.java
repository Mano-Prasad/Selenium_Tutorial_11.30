package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial4_Basic_Methods1 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		String actual_title = driver.getTitle();
		
		System.out.println(actual_title);
		
		String actual_url = driver.getCurrentUrl();
		
		System.out.println(actual_url);
		
		
	}

}
