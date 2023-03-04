package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5 {
	public WebDriver driver;

	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("kukon11675@gmail.com");
		Thread.sleep(3000);
	    driver.findElement(By.id("pass")).sendKeys("akmiah23");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}

}
