package trainingSel.SeleniumTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {
	
	@Test
	public void testMethod1() {
		System.out.println("Inside my Testng method testMethod1");
	}
	
	@Test(dataProvider="ABC")
	public void testMethod2(String svalue) {
		System.out.println("Inside my Testng method testMethod2" + svalue);
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Inside my Testng method testMethod3");
	}
	
	@DataProvider(name="ABC")
	public Object[][] dpMethod() {
		return new Object[][] {{"First-Value"},{"Second-Value"}};
	}
	
}
	
