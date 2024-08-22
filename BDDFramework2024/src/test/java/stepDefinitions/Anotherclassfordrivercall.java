package stepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjectModel.FbLogin;

public class Anotherclassfordrivercall {
	
	private static FbLogin facebook = new FbLogin();
	private static WebDriver driver = FbLogin.openBrowser("Chrome");
	
	
	public void ok() {
		driver.quit();
	}
	

}
