package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoapp.skillrary.com/");
	    
	    WebElement ele = driver.findElement(By.id("cars"));
	    Select s=new Select(ele);
	    s.selectByIndex(2);
	    s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
	    s.selectByValue("299");
	    
	    s.deselectByIndex(2);
	    
	    s.deselectByValue("299");
	    
	    s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
	    
	    driver.close();
	    
	    //this is call multiple select dropdown 
	    //copy from select class to deselect class

	}

}
