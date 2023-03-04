package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	    driver.findElement(By.id("add-to-cart-button")).click();
	    Thread.sleep(4000);
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    //you have to validate first
	    //then you have to verification
	    //this is default/ login
	    if(title.equals("amazon - Login")) {
	    	System.out.println("Pass:home page is displayed");
	    }
	    else 
	    {
	    	System.out.println("fail:home page is not displayed");
	    driver.close();
	    
	    } 
	    
	}
}


