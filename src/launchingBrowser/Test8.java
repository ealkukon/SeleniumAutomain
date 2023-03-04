package launchingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to program to maximize it
public class Test8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // this is called method changes 
		driver.get("https://www.facebook.com/");
		
		
		    
	}

}
