package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    driver.findElement(By.name("q")).sendKeys("dress");
	    driver.findElement(By.xpath("//button[@type='submit']")).submit();
	    driver.findElement(By.xpath("//a[text()='Women Ethnic Dress White Dress']")).click();
	    driver.findElement(By.xpath("//a[text()='M']")).submit();
	    driver.findElement(By.xpath("//button[text()='Add to cart']")).submit();
	    
	}
}
