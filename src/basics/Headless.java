package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(opt);
		
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
