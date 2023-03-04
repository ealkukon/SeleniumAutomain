package scrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    
	    WebElement ele = driver.findElement(By.linkText("Careers"));
	    Point loc = ele.getLocation();
	    int x = loc.getX();
	    int y = loc.getY();
	    JavascriptExecutor j=(JavascriptExecutor) driver;
	    j.executeScript("window.scrollBy("+x+","+y+")");
	    ele.click();
	    Thread.sleep(3000);
	    driver.close();
	    //this is for the particular element

	}

}
