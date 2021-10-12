package trainingSel.SeleniumTraining;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1 {
	
	@Test(priority=2)
	public void testMethod1() {
		System.out.println("Inside my Testng method testMethod1");
	}
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Inside Before Suit");
	}
	
	@Test(priority=1)
	public void testMethod2() {
		System.out.println("Inside my Testng method testMethod2");
	}
	@Test(priority=0)
	public void testMethod3() {
		System.out.println("Inside my Testng method testMethod3");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside my Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Inside my After Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside my Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside my After Method");
	}
	
}
	
