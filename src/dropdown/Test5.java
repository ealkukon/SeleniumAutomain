package dropdown;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.walmart.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//span[contains(text(),' Essentials Ocean Breeze Moisturizing ')]")).click();
	    WebElement ele = driver.findElement(By.xpath("(//span[@content='1.94'])[2]"));
	    Select s=new Select(ele);
	    s.selectByIndex(1);
	    //s.selectByValue("1.94");
	    //s.selectByVisibleText("This is kukon");
	    List<WebElement> alloption = s.getOptions();
	    System.out.println(alloption.size());
	    ArrayList<String> a=new ArrayList<String>();
	    
	    for(WebElement e:alloption) {
	        String text = e.getText();
	        System.out.println(text);
	        a.add(text);
	    }
	    System.out.println("after sorting");
	    System.out.println("************************");
	    Collections.sort(a);
	    for(String c:a) {
	       System.out.println(c);

	     //interview question,sorted in a alpha uranium ascending order  
	    }
	   

	    
	} 

}

	   
	   
	
	    
   
	  

	


