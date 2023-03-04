package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.snapdeal.com/");
	    //driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	    driver.findElement(By.xpath("//a[text()='login']")).click();
	    driver.switchTo().frame(0);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[text()='Google']")).click();
	    
	   
	    
	    

	}

}
