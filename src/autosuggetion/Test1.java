package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    
	    WebElement ele = driver.findElement(By.name("q"));
	    ele.sendKeys("python");
	    Thread.sleep(3000);
	    List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='sbtc']"));
	    System.out.println(ele1.size());
	    for(WebElement b:ele1) {
	    	System.out.println(b.getText());
	    }
	    Thread.sleep(3000);
	    driver.close();
	}

}
