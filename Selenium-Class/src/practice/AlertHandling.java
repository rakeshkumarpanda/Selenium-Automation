package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.co.in");
		
		WebElement accomodation = driver.findElement(By.id("hotelsAndLounges"));
		Actions act = new Actions(driver);
		
		act.moveToElement(accomodation).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Hotels & Lounge')]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		
		String parentID = itr.next();
		String childID = itr.next();
		
		driver.switchTo().window(childID);
		System.out.println("Switched to child window");
		driver.findElement(By.xpath("//a[contains(text(),'Accommodation')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value = 'Check Availability']")));
		
		driver.findElement(By.xpath("//input[@value = 'Check Availability']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
