package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test6 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("gh-ac")).sendKeys("dress");
	    driver.findElement(By.id("gh-btn")).click();
	    //Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//h3[@class=\"s-item__title\"]")).click();
	    WebDriverWait w=new WebDriverWait(driver,3);
	    w.until(ExpectedConditions.elementToBeClickable(By.id("atcRedesignId_btn"))).click();
	    //driver.findElement(By.id("atcRedesignId_btn")).click();
	    
	    
	   
	    

	}

}
