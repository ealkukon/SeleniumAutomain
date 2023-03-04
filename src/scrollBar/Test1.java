package scrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.com/");
		    
		    JavascriptExecutor j=(JavascriptExecutor)driver;
		    j.executeScript("window.scrollBy(0,3000)");
		    j.executeScript("window,scrollBy(0,-3000)");
		
	


	}

}
