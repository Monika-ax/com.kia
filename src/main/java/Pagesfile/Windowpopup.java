package Pagesfile;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowpopup {
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
			driver.get("https://newstage.factorfox.net/Home/LogOff/101#/ClientList");
			Alert a = driver.switchTo().alert();
            a.accept();
			
			
			
        	
//    		WebDriverWait wait1 = new WebDriverWait (driver,Duration.ofSeconds(15));
//    		wait1.until(ExpectedConditions.alertIsPresent());
    		
			
//            driver.findElement(By.xpath("//button[@id = \"confirmBox\"]")).click();
//			Alert a1 = driver.switchTo().alert();
//			a1.dismiss();
//
//WebDriverWait wait1 = new WebDriverWait (driver,Duration.ofSeconds(15));
//wait1.until(ExpectedConditions.alertIsPresent());
//			
//			
////			driver.findElement(By.xpath("//button[@id = \"promptBox\"]")).click();
////			Alert a1 = driver.switchTo().alert();
//////			String s = a1.getText();
//////			System.out.println(s);
////			
////			a1.sendKeys("testAutomation");
////			a1.accept();
////			
}
}
