package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://om.cleartrip.com/flights");
	    
	    driver.findElement(By.xpath("//div[text()='Wed, Feb 15']")).click();
	    driver.findElement(By.xpath("//div[text()='20']")).click();
	    //this is hidden division/calendar

	}

}
