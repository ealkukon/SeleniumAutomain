package launchingBrowser;
//Navigate Method from WebDriver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		   
		    driver.navigate().to("https://www.facebook.com/");
		    driver.navigate().back();
		    Thread.sleep(3000);//this is for little extra time to hold
		    driver.navigate().forward();
		    Thread.sleep(3000);
		    driver.navigate().refresh();
		    Thread.sleep(3000);
		    driver.close();

	}

}
