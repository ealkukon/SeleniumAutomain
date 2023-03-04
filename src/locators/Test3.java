package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    
	    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("kukon11675@gmail.com");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("akmiah23");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("button[name='login']")).click();
	    Thread.sleep(5000);
	    
	 
	    
	}

}
