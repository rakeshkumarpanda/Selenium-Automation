package practice;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	
	@Test
	public void zTest()
	{
		System.out.println("zTest Executed");
	}
  
	@Test
	public void aTest()
	{
		System.out.println("aTest Executed");
	}
	
	@Test
	public void bTest()
	{
		System.out.println("bTest Executed");
	}
	
	@BeforeMethod
	public void beforeMethodTest()
	{
		System.out.println("Before Method Executed");
	}
	
	@AfterMethod
	public void afterMethodTest()
	{
		System.out.println("After Method Executed");
	}
	
	@BeforeTest
	public void beforeTestTest()
	{
		System.out.println("Before Test Executed");
	}
	
	@AfterTest
	public void afterTestTest()
	{
		System.out.println("After Test Executed");
	}
	
	@BeforeClass
	public void beforeClassTest()
	{
		System.out.println("Before Class Executed");
	}
	
	@AfterClass
	public void afterClassTest()
	{
		System.out.println("After Class Executed");
	}
	
	@BeforeSuite
	public void beforeSuiteTest()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuiteTest()
	{
		System.out.println("After Suite");
	}
	
	@BeforeGroups
	public void beforeGroupsTest()
	{
		System.out.println("Before Groups");
	}
	
	@AfterGroups
	public void afterGroupsTest()
	{
		System.out.println("After Groups");
	}
	
	
	
	
	
	
}
