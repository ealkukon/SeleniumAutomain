package actionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	    
	    WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	    WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	    Actions a=new Actions(driver);
	    a.dragAndDrop(src,dest).perform();
	    //this is drag and drop
	    
	}

}
