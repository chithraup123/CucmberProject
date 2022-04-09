package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = BaseClass.driver;

	@Given("I have opened the application in the browser")
	public void i_have_opened_the_application_in_the_browser() throws InterruptedException {
		driver.get("https://www.simplilearn.com");
		Thread.sleep(1000);
	}

	@When("I click on Login link")
	public void i_click_on_login_link() {
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("I enter username")
	public void i_enter_username() {
		WebElement userNameElement = driver.findElement(By.name("user_login"));
		userNameElement.sendKeys("xyz@abc.com");
	}

	@When("I enter password")
	public void i_enter_password() {
		WebElement pwdElement = driver.findElement(By.id("password"));
		pwdElement.sendKeys("abc@12345");
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.name("btn_login")).click();
	}

	@Then("I should be landed on Home page")
	public void i_should_be_landed_on_home_page() {
		System.out.println("Home Page.................");
	}

	@When("I enter username {string}")
	public void i_enter_username(String userName) {
		WebElement userNameElement = driver.findElement(By.name("user_login"));
		userNameElement.sendKeys(userName);
	}

	@When("I enter password {string}")
	public void i_enter_password(String password) {
		WebElement pwdElement = driver.findElement(By.id("password"));
		pwdElement.sendKeys(password);
	}
	
	@Then("the validation message should be shown as {string}")
	public void the_validation_message_should_be_shown_as(String string) {
	    WebElement validatinMsgElmnt = driver.findElement(By.id("msg_box"));
	    Assert.assertEquals("The email or password you have entered is invalid.", validatinMsgElmnt.getText());
	}
}
