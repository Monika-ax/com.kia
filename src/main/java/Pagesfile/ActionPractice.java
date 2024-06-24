package Pagesfile;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionPractice {
	public static void main(String[] args) throws InterruptedException, IOException{ 
		
		 WebDriverManager.chromedriver().setup();
		 WebDriverManager.chromedriver().clearDriverCache().setup();
			
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://newstage.factorfox.net/Home/LogOff/101#/ClientList");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.navigate().back();
		  driver.navigate().forward();
		  driver.navigate().refresh();
		 
		  TakesScreenshot t = (TakesScreenshot)driver;
		  File src = t.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src, new File("C:/Users/HP 840 G3/eclipse-workspace/com.auto/src/Screenshot/test.png"));
}}
