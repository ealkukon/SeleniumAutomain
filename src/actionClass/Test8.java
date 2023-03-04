package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		 
		 WebElement ele = driver.findElement(By.id("menu_pim_Configuration"));
		 Select s=new Select(ele);
		 s.selectByIndex(2);
		 driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		 driver.findElement(By.id("//a[text()='Custom Field Name']")).click();
		
		driver.findElement(By.name("empsearch[employee_name][empId]")).sendKeys("Linda Jane Anderson");
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 driver.close();
		 
		
		 
		 
		 //WebDriverWait w=new WebDriverWait(driver,5);
		 //w.until(ExpectedConditions.elementToBeClickable(By.xpath("add-to-cart-button"));

	}

}

