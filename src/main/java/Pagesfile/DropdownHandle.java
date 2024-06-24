package Pagesfile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {
	public static void main(String[] args) throws InterruptedException {
		
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
	driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	driver.manage().window().maximize();

	WebElement button  = driver.findElement(By.xpath("//button[@id=\"menu1\"]"));
	 button.click();
//		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(button));

	 
	 List<WebElement> values= driver.findElements((By.xpath("//ul[@class=\"dropdown-menu\"]/li/a")));
		
		WebDriverWait wait1 = new WebDriverWait (driver,Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.visibilityOfAllElements(values));
		
		// for each loop
		
		for(WebElement t:values) {
			String dropdownValue = t.getText();
			
			if(dropdownValue.equals("JavaScript")) {
				t.click();
		        break;
			}
		
		}
	}}
	
	
	
		


