package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    
	    TakesScreenshot t=(TakesScreenshot) driver;
	    File src = t.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./photo/amazon.png");
	    FileUtils.copyFile(src, dest);
	    driver.close();
	    //this is screenshot

	}

}
