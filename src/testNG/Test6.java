package testNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test6 {
	public WebDriver driver;

	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("");
	}
	   
	@Test
	public void login() throws InterruptedException {
		
	}
	@AfterMethod
	public void closapp() {
		driver.close();
	}
}
