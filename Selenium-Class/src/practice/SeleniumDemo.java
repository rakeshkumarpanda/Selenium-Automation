package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
//		driver.quit();

	}

}
