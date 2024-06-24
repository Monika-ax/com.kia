package Pagesfile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuth {
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			Thread.sleep(5000);
			WebDriverWait wait1 = new WebDriverWait (driver,Duration.ofSeconds(15));
//			wait1.until(ExpectedConditions.textToBePresentInElement());
						
			
}
}
