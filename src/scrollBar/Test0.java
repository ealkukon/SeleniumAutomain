package scrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    
	    JavascriptExecutor j=(JavascriptExecutor)driver;
	    j.executeScript("window.scrollBy(0,5000)");
	    //this is scroll down
	    
	    
	}
	}