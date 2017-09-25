package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUpload {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\ab42864\\Desktop/PPO_Error Logs.txt";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demoqa.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).click();
		
		WebElement uploadFile = driver.findElement(By.id("profile_pic_10"));
		uploadFile.sendKeys(filePath);

	}

}
