package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	
	@Test
	public void test1()
	{
		System.out.println("Test1 Started");
		Assert.assertNotEquals(true, false);
		System.out.println("Test1 Executed");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("Test2 Started");
		Assert.assertEquals(true, true);
		System.out.println("Test2 Executed");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3 Started");
		Assert.assertEquals(true, true);
		System.out.println("Test3 Executed");
	}

}
