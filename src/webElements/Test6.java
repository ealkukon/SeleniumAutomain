package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	    
	    driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	    //driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	    //when it is pomp kind of element then we used submit methods, other wise you can you click() method, 

	}

}
