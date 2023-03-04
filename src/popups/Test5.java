package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.naukri.com/account/register/basicdetails");
	    
	    driver.findElement(By.xpath("//button[text()='I'm a Fresher']")).click();
	    driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("‪C:\\Users\\Asus\\Downloads\\Qa.pdf");
	    Thread.sleep(5000);
	    //this is upload file
	    
	    
		

	}

}
