package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    driver.findElement(By.xpath("//div[text()='Users']")).click();
	    driver.findElement(By.id("container")).click();
	    driver.findElement(By.xpath("//div[text()='New User']")).click();
	    driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("saahil");
	    //driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
	   
	    Alert a = driver.switchTo().alert();
	    Thread.sleep(5000);
	    a.accept();
	    //a.dismiss();
	    Thread.sleep(5000);
	    driver.close();
	    
	

	}

}
