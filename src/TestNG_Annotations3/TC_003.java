package TestNG_Annotations3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_003 extends Conftest
{
	@Test
	public void verifyMetaData()
	{
		String meta = driver.findElement(By.xpath("//span[text()=' Meta © 2025']")).getText();
		
		System.out.println(meta);
	}

}
