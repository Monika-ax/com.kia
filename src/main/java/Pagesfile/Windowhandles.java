package Pagesfile;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			driver.findElement(By.xpath("//button[@id= \"newWindowBtn\"]")).click();
			
				
			String parentId = driver.getWindowHandle();
		    Set<String> allwindows = driver.getWindowHandles();
		    for(Office s:allwindows) {
		    	if(!parentId.equals (s)) {
		    	driver.switchTo().window(s);
		    	break;
			
}
}
}}
