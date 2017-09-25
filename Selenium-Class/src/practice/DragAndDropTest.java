package practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void appLaunch()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
	}
	
	@Test
	public void dragAndDropTest() throws InterruptedException
	{
		
		
		driver.findElement(By.id("menu-item-141")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'Drag me to my tar')]")));
		
		WebElement from = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my tar')]"));
		WebElement to = driver.findElement(By.id("droppableview"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).perform();
		
		Thread.sleep(5000);
	}
		
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
		
		
		
	}


