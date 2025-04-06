package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial19_Basic_Methods2 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.partialLinkText("new account"));
		
		String cna1 = btn.getAccessibleName();
		
		System.out.println(cna1);
		
		String cna2 = btn.getTagName();
		
		System.out.println(cna2);
		
		String cna3 = btn.getAriaRole();
		
		System.out.println(cna3);
		
		
		int cna4_x_position = btn.getLocation().getX();
		
		System.out.println(cna4_x_position);
		
		
		int cna5_y_position = btn.getLocation().getY();
		
		System.out.println(cna5_y_position);
		
		
		int cna6_height = btn.getSize().getHeight();
		
		System.out.println(cna6_height);
		
		int cna7_width = btn.getSize().getWidth();
		
		System.out.println(cna7_width);
		
		/*String cna8 = btn.getAttribute("class");
		
		System.out.println(cna8);*/
		
		String cna9 = btn.getDomAttribute("class");
		
		System.out.println(cna9);
		
		String cna10 = btn.getCssValue("font-size");
		
		System.out.println(cna10);
		
		String cna11 = btn.getCssValue("background-color");
		
		System.out.println(cna11);
		
		String cna12 = btn.getCssValue("color");
		
		System.out.println(cna12);
		
		System.out.println(driver.getPageSource());
		
		WebElement un = driver.findElement(By.id("email"));
		
		un.sendKeys("Ramkumar@gmail.com");
		
		System.out.println(un.getDomProperty("value"));
	}

}
