package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//span[@dir='auto']")).click();
	    driver.findElement(By.id("add-to-cart-button")).click();
	    
	    
	    
	   // WebDriverWait w=new WebDriverWait(driver,5);
	   // w.until(ExpectedConditions.elementToBeClickable(By.xpath("add-to-cart-button"));
	    
	    
	}
}
