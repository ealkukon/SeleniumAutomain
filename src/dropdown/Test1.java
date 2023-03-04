package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    
	    WebElement ele = driver.findElement(By.id("gh-cat"));
	    Select s=new Select(ele);
	    s.selectByIndex(4);
	    s.selectByValue("550");
	    System.out.println(s.isMultiple());//False,This is not multiple select drop down
	    List<WebElement> option = s.getOptions();
	    System.out.println(option.size());
	    for(WebElement e:option) {
	    	System.out.println(e.getText());
	   }
	    driver.close();
	}	    
}