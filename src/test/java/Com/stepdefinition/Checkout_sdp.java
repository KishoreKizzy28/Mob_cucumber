package Com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.Testrunner.Runner_class;
import Com.pgm.Page_Object_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_sdp extends Base_class {
	
	public static WebDriver driver = Runner_class.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("user Click the continue button")
	public void user_click_the_continue_button() {
		System.out.println(pom.getInstanceCC().getHeader().isDisplayed());
		System.out.println(pom.getInstanceCC().getHeader().getText());
		implicitwait(10,TimeUnit.SECONDS);
	    
	}
	@Then("it Navigate to Information Page")
	public void it_navigate_to_information_page() {
		clickonElement(pom.getInstanceCC().getSub());
	}


}
