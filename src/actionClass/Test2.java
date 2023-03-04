package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//body[@class='fk-modal-visible']")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    WebElement ele = driver.findElement(By.id("container"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//html[@class=' fonts-loaded']")).click();
	    //this is mouseActions by action class
	    

	}

}
