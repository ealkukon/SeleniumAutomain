package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	@FindBy(id="email")
	private WebElement emailaddresstb; //declaration
	
	@FindBy(id="pass")
	private WebElement passwordtb;     //declaration
	
	
	Demo(WebDriver driver) {
		PageFactory.initElements(driver,this);  //Initialization
	}
	
	public void emailtb(String email) {         // Utilization
		emailaddresstb.sendKeys(email);
		}
	public void passwordtb(String pass) {       //Utilization
		passwordtb.sendKeys(pass);
	}
}
		
	
	
	


