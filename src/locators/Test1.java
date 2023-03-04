package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    
		    driver.findElement(By.linkText("Forgot password?")).click();
		    driver.findElement(By.name("email")).sendKeys("kukon23@gmail.com");
		    driver.findElement(By.linkText("Forgot Account?")).click();
		    driver.findElement(By.name("email")).sendKeys("kukon23@gmail.com");
		    driver.findElement(By.name("did_submit")).click();
		    //driver.findElement(By.partialLinkText("account?")).click();
		    //Thread.sleep(3000);
		    //driver.close();
		    

	}

}
