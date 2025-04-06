package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial12_CSS_Selector {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("javaSelenium");
		
		driver.findElement(By.cssSelector("input[data-testid='royal-pass']")).sendKeys("Admin123");
		
		String fb_text = driver.findElement(By.cssSelector("h2._8eso")).getText();
		
		System.out.println(fb_text);
		
		String cna1 = driver.findElement(By.cssSelector("a[id*='0_0']")).getText();
		
		System.out.println(cna1);
		
		String cna2 = driver.findElement(By.cssSelector("a[id^='u_0_0']")).getText();
		
		System.out.println(cna2);
		
		String cna3 = driver.findElement(By.cssSelector("a[data-testid*='reg']")).getText();
		
		System.out.println(cna3);
		
		
		String cna4 = driver.findElement(By.cssSelector("a[data-testid^='open']")).getText();
		
		System.out.println(cna4);
		
		String fb_text2 = driver.findElement(By.cssSelector("html>body>div>div>div>div>div>div>div>h2")).getText();
		
		System.out.println(fb_text2);
		
		String copyWright1 = driver.findElement(By.xpath("//div[@id='pageFooter']/div[3]/div/span")).getText();
		
		System.out.println(copyWright1);
		

	}

}
