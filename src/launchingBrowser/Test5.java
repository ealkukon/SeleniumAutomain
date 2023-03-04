package launchingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.id("email")).sendKeys("samit miah");
		 driver.findElement(By.id("pass")).sendKeys("samit miah");
		 driver.findElement(By.name("login")).click();
		    
		
	}
}
