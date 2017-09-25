package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGSession1 {
	
	@Test
	public void launchBrowserTest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
