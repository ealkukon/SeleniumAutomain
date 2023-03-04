package launchingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // this is called method changes 
		driver.get("https://www.amazon.com/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getClass());
		System.out.println(driver.hashCode());
		//driver.close();


			}

		}
	
		

