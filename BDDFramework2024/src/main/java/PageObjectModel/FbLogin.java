package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	
	
	By UN = By.id("email");
	By PWD = By.id("pass");
	By Button = By.id("u_0_5_g3");
	
	static WebDriver driver ;
	public static String browser="firefox";
	
	
	
	public static void openBrowser() {
		 
		if(browser.equalsIgnoreCase("CHROME")) {
			driver = WebDriverManager.chromedriver().create();
		}
	
		else if(browser.equalsIgnoreCase("FIREFOX")) {
			driver = WebDriverManager.firefoxdriver().create();
			
		}
		
		
		else {
			driver = WebDriverManager.edgedriver().create();
	
		}
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		}
	
	public WebDriver getDriver()
	{
		return driver;
	}


	public void enterUserName() {
		driver.findElement(UN).sendKeys("Name");
	}
	
	public void enterPassword() {
		driver.findElement(PWD).sendKeys("Pass");
	}
	
	public void clickLoginButton() {
		driver.findElement(Button).click();
	}
}
