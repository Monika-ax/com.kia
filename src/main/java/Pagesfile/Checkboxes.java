package Pagesfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		List<WebElement> allcheckbox =driver.findElements(By.xpath("//input[@Class = \"bcCheckBox\"]"));
//		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.invisibilityOf(allcheckbox);
//		
		for(WebElement ele:allcheckbox) {
			String Value = ele.getAttribute("id");
			if (Value.equals("hindichbx")||Value.equals("chinesechbx"))
			{
			ele.click();
		
//     int l = allcheckbox.size();
//     for(int i =l-2;i<l;i++)
//    {
//	allcheckbox.get(i).click();
		
      }
	}
}
}



//for(WebElement ele:allcheckbox) {
//	String Value = ele.getAttribute("id");
//	if (Value.equals("hindichbx")||Value.equals("chinesechbx"));{
//	ele.click();

