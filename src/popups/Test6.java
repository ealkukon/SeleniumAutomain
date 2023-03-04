package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.naukri.com");
	    
	    String parent = driver.getWindowHandle();
	    System.out.println(parent);
	    Set<String> child = driver.getWindowHandles();
	    System.out.println(child);
	    driver.close();
	    //this is close particular window 

	    
	}

}
