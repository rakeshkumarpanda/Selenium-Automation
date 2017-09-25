package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");

	}

}
