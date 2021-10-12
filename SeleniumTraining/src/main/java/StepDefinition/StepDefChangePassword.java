package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefChangePassword {
	WebDriver wd ;
	
	@Given("Navigate to the application")
	public void navigate_to_the_application() throws Throwable {
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

	@When("I click on account icon")
	public void i_click_on_account_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement lnk_Accnt = wd.findElement(By.xpath("//*[@class='tb_link dropdown tb_menu_system_account_account']"));
		Thread.sleep(2000);
		lnk_Accnt.click();
	}

	@When("I enter login id")
	public void i_enter_login_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		wd.findElement(By.name("email")).sendKeys("random8@gmail.com");
	}

	@When("I enter login password")
	public void i_enter_login_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("password")).sendKeys("manzoor1");
	}

	@When("I click on login button")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement btn_Login = wd.findElement(By.xpath("//*[@class='btn btn-primary' and @value='Login']"));
		btn_Login.click();
	}

	@When("I click on change your password link")
	public void i_click_on_change_your_password_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		WebElement lnk_changePassword = wd.findElement(By.xpath("//*[contains(text(),'Change your password')]"));
		lnk_changePassword.click();
	}

	@When("I enter new password in Password textbox")
	public void i_enter_new_password_in_password_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		wd.findElement(By.name("password")).sendKeys("mehadi");
	}

	@When("I enter same credentials in Confirm Password textbox")
	public void i_enter_same_credentials_in_confirm_password_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		wd.findElement(By.name("confirm")).sendKeys("mehadi");
	}

	@When("I click on continue")
	public void i_click_on_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement btn_Login = wd.findElement(By.xpath("//*[@class='btn btn-primary' and @value='Continue']"));
		btn_Login.click();
	}

	@Then("My password is updated successfully")
	public void my_password_is_updated_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[contains(text(),' Success: Your password has been successfully updated.')]")).isDisplayed();
	}

	@Then("I close my browser")
	public void i_close_my_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			wd.quit();
		}catch(RuntimeException e) {

		}
	}

}
