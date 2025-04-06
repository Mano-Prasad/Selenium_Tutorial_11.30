package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tutorial2_Open_EdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
