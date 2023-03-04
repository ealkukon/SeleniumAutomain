package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		    
		 //driver.findElement(By.linkText("Forgot your password?")).click();
		 driver.findElement(By.partialLinkText("password")).click();
		 //Thread.sleep(3000);
		 //driver.close();
		    

	}

}
