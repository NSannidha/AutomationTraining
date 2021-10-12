package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin {
	WebDriver wd ;
	
	@Given("Navigate to Application")
	public void navigate_to_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("navigate_to_retail_application");System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0029FE744\\eclipse-workspace\\SeleniumTraining\\Drivers\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		// Navigating to URL
		wd.get("http://retailm1.upskills.in/");
		Thread.sleep(2000);
	}
	
	@When("I click on accnt Icon")
	public void i_click_on_accnt_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement lnk_Accnt = wd.findElement(By.xpath("//*[@class='tb_link dropdown tb_menu_system_account_account']"));
		Thread.sleep(2000);
		lnk_Accnt.click();
	}

	@When("I enter Login ID")
	public void i_enter_login_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		wd.findElement(By.name("email")).sendKeys("random3@gmail.com");
	}
	
	@When("I enter Login Password")
	public void i_enter_login_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("password")).sendKeys("manzoor1");
	}

	@When("I click on Login button")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		WebElement btn_Login = wd.findElement(By.xpath("//*[@class='btn btn-primary' and @value='Login']"));
		btn_Login.click();
	}

	@Then("I am able to login successfully")
	public void i_am_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement text = wd.findElement(By.xpath("//*[contains(text(),'My Orders')]"));
		text.isDisplayed();
	}

	@Then("I close browser")
	public void i_close_browser() throws Throwable {
		try{
			wd.quit();
		}catch(RuntimeException e) {

		}
	 }
}
