package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	    driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    
	    String title=driver.getTitle();
	    System.out.print(title);
	    
	    String url=driver.getCurrentUrl();
	    System.out.print(url);
	    //driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    //as automation tester you have to validate statement
	   
	    if(title.equals("actiTIME - Login")) {
	    	System.out.println("Pass:home page is displayed");
	    }
	    else
	    {
	    	System.out.println("fail:home page is displayed");
	    }
	    driver.close();
	    	
	    }
	    
	    
	    

	}


