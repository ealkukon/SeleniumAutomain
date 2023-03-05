package testNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


// Parallel two browser running  as same time chrome and fire fox browser same application 


public class Test3 {
	public WebDriver driver;

	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}
	@Parameters( {"browserName"} )
	@Test
	public void login(String browser) {
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
			
		}
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//body[@class='fk-modal-visible']")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement ele = driver.findElement(By.id("container"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//html[@class=' fonts-loaded']")).click(); 
	}
}	 
		   
		    
	