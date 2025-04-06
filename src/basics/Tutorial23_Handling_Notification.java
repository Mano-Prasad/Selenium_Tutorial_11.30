package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Tutorial23_Handling_Notification {

	public static void main(String[] args) {
		
		/*ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.justdial.com/");
		
		driver.manage().window().maximize();*/
		
		
		EdgeOptions opt = new EdgeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new EdgeDriver(opt);
		
		driver.get("https://www.justdial.com/");
		
		driver.manage().window().maximize();

	}

}
