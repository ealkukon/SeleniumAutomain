package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.sendKeys("fghytjuytfgy");
	    Thread.sleep(3000);
	    ele.clear();
	    
//create some user data & clear user data
	}

}
