package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.co.in");
		
		WebElement accomodation = driver.findElement(By.id("hotelsAndLounges"));
		
		Actions act = new Actions(driver);
		act.moveToElement(accomodation).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Hotels & Lounge')]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles.size());
		
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
//		System.out.println(parentWindow+"     "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.xpath("//a[contains(text(),'Accommodation')]")).click();
		driver.findElement(By.xpath("//input[@value = 'Check Availability']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("loginbutton")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
