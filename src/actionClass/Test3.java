package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoapp.skillrary.com/");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    WebElement ele = driver.findElement(By.id("course"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	    WebElement ele1 = driver.findElement(By.id("add"));
	    a.doubleClick(ele1).perform();
	    //this is doubleClick by action class
	}


}