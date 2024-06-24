package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage {
	WebDriver driver;
	@Given("Launch the URL")
	public void launch_the_url() {
	 driver = new ChromeDriver();
		 driver.get("https://beta.factorfox.net/Invoices/Index#/PendingInvoices");
	   
	}

	@Given("Enter the username and pass")
	public void enter_the_username_and_pass() {
		WebElement emailaddress = driver.findElement(By.xpath("//input[@id = \"user\"]"));
		emailaddress.sendKeys("njones@abc.com");
		WebElement password = driver.findElement(By.xpath("//input[@id = \"password\"]"));
		password.sendKeys("PA8KH67AZ56");
	    
	    
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[@class = \"btn\"]"));
		loginBtn.click();
	}

	@Then("Sucessful login")
	public void sucessful_login() {
	    
	}

}
