package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoapp.skillrary.com/");
	    
	    WebElement ele = driver.findElement(By.id("cars"));
	    Select s=new Select(ele);
	    s.deselectByIndex(2);
	    s.selectByValue("199");
	    
	    System.out.println(s.isMultiple());//thru
	    if(s.isMultiple()) {
	    	s.deselectAll();
	    	//This is multiple select drop down 
	    	//if single select drop down is fuals
	    }

	}

}
