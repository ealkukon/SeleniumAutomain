package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/deals");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    WebElement ele = driver.findElement(By.linkText("Fashion"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();// i want to perform mouse over
	    driver.findElement(By.linkText("Watches")).click();
	    //this is mouseActions by action class
	

	}

}
