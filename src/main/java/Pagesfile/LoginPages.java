package Pagesfile;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPages {
	public static void main(String[] args) throws InterruptedException{ 
		
 WebDriverManager.chromedriver().setup();
 WebDriverManager.chromedriver().clearDriverCache().setup();
	
 WebDriver driver = new ChromeDriver();
 driver.get("https://newstage.factorfox.net/Home/LogOff/101#/ClientList");
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
//WebElement emailaddress = driver.findElement(By.xpath("//input[@id =\"user\"]"));
//emailaddress.sendKeys("shweta@bytexus.com");
//
//
//WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
//password.sendKeys("factor");
////
//WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//loginBtn.click();
//
//WebDriverWait wait1 = new WebDriverWait (driver,Duration.ofSeconds(15));
//wait1.until(ExpectedConditions.elementToBeClickable(loginBtn));

	}
}

