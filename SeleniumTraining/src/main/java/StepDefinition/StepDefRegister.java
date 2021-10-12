package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefRegister {
	WebDriver wd ;
	@Given("Navigate to Retail Application")
	public void navigate_to_retail_application() throws Throwable {
		System.out.println("navigate_to_retail_application");System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0029FE744\\eclipse-workspace\\SeleniumTraining\\Drivers\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		// Navigating to URL
		wd.get("http://retailm1.upskills.in/");
		Thread.sleep(2000);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on Account Icon")
	public void i_click_on_account_icon() throws Throwable {
		WebElement lnk_Accnt = wd.findElement(By.xpath("//*[@class='tb_link dropdown tb_menu_system_account_account']"));
		Thread.sleep(2000);
		lnk_Accnt.click();
	}
//
//	@When("Click on Login\\/Register Link")
//	public void click_on_login_register_link() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		WebElement lnk_Register = wd.findElement(By.xpath("//*[contains(text(),'LOGIN / REGISTER')]"));
//		//lnk_Register.click();
//	    
//	}

	@When("Click on Register button")
	public void click_on_register_button() throws Throwable {
		Thread.sleep(4000);
		WebElement btn_Register = wd.findElement(By.xpath("//*[@class='btn btn-primary' and contains(text(),'Register')]"));
		btn_Register.click();
	}
	
	@Then("Enter firstName")
	public void enter_first_name() throws Throwable {
	    Thread.sleep(8000);
		wd.findElement(By.name("firstname")).sendKeys("manzoor");
	}

	@Then("Enter SecondName")
	public void enter_second_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("lastname")).sendKeys("manzoor");
	}

	@Then("Enter Email")
	public void enter_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("email")).sendKeys("random3@gmail.com");
	}

	@Then("Enter Telephone")
	public void enter_telephone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("telephone")).sendKeys("9876543210");
	}

	@Then("Enter Address1")
	public void enter_address1() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("address_1")).sendKeys("yeshwanthapur");
	}

	@Then("Enter Address2")
	public void enter_address2() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("address_2")).sendKeys("bangalore"); 
	}

	@Then("Enter City")
	public void enter_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("city")).sendKeys("bangalore"); 
	}

	@Then("Enter PostCode")
	public void enter_post_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("postcode")).sendKeys("560022"); 
	}

	@Then("Enter Country")
	public void enter_country() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Select drp_Country = new Select(wd.findElement(By.name("country_id")));
		drp_Country.selectByVisibleText("India"); 
	}

	@Then("Enter State")
	public void enter_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Select drp_Region = new Select(wd.findElement(By.name("zone_id")));
		drp_Region.selectByVisibleText("Karnataka");
	}

	@Then("Enter Password")
	public void enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("password")).sendKeys("manzoor1");
	}

	@Then("Confirm Password")
	public void confirm_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("confirm")).sendKeys("manzoor1");
	}

	@Then("Click Subscribe as No")
	public void click_subscribe_as_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("newsletter")).click();
	}

	@Then("Select Agree Privacy Policy")
	public void select_agree_privacy_policy() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("agree")).click();
	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement btn_Continue = wd.findElement(By.xpath("//*[@class='btn btn-primary']"));
		Thread.sleep(2000);
		btn_Continue.click();
	}

	@Then("I am able to register successfully")
	public void i_am_able_to_register_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement text = wd.findElement(By.xpath("//*[contains(text(),'Congratulations! Your new account has been successfully created!')]"));
		text.isDisplayed();
	}
	
	@Then("close browser")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			wd.quit();
		}catch(RuntimeException e) {
//			e.printStackTrace();
		}
	    //throw new io.cucumber.java.PendingException();
	}


}
