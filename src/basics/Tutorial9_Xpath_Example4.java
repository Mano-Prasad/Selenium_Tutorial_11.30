package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial9_Xpath_Example4 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		System.out.println("=====Contains attribute====");
		
		String cna = driver.findElement(By.xpath("//a[contains(@id,'_0_0_')]")).getText();
		
		System.out.println(cna);
		
		
		System.out.println("=====Starts-with attribute====");
		
		String cna1 = driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).getText();
		
		System.out.println(cna1);
	
	
	}

}
