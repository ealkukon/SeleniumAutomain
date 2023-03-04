package locators;
//This is from trainer Done
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://automationpractice.pl/index.php?controller=authentication");
	    
	    driver.findElement(By.id("search_query_top")).sendKeys("dress");
	    driver.findElement(By.name("submit_search")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[1]")).click();
	    //WebDriverWait w=new WebDriverWait(driver,3);
	    //w.until(ExpectedConditions.elementToBeClickable("//span[text()='Add to cart']")).click();
	    driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	  
	}

}
