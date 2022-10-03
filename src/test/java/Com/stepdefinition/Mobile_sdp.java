package Com.stepdefinition;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.Testrunner.Runner_class;
import Com.pgm.Page_Object_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mobile_sdp extends Base_class {
	
	public static WebDriver driver = Runner_class.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@When("user Click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		clickonElement(pom.getInstanceMB().getCart());
	}
	@Then("it Navigates to Shopping cart page")
	public void it_navigates_to_shopping_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
