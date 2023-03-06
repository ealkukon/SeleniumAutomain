package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.snapdeal.com/");
	    //driver.manage().window().maximize();
	    
	    WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();
	    
	    driver.findElement(By.xpath("//a[text()='login']")).click();
	    driver.switchTo().frame(0);
	    Thread.sleep(5000);
	    
	    driver.findElement(By.id("close-pop")).click();
	    driver.switchTo().defaultContent();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.id("inputValEnter")).sendKeys("phone");
	    Thread.sleep(5000);
	    driver.close();
	    //this is frames
	   
	}

}
