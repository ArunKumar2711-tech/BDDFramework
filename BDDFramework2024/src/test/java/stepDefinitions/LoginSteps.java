package stepDefinitions;

import PageObjectModel.FbLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private final FbLogin facebook = new FbLogin();
	
	@When("User is navigation to Facebook login page")
	public void user_is_navigation_to_facebook_login_page() {
		facebook.openBrowser();
	}

	@And("Entering User Name")
	public void entering_user_name() {
	    facebook.enterUserName();
	}

	@And("Entering Password")
	public void entering_password() {
	    facebook.enterPassword();
	}

	@Then("Clicking on Login button")
	public void clicking_on_login_button() {
	    facebook.clickLoginButton();
	}


}
