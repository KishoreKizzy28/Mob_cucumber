package Com.stepdefinition;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.Testrunner.Runner_class;
import Com.pgm.Page_Object_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ordered_sdp extends Base_class{
	
	public static WebDriver driver = Runner_class.driver;
		 
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("user Click the Place Order button")
	public void user_click_the_place_order_button() {
		clickonElement(pom.getInstanceCR().getOrder());
	    
	}
	@Then("it Navigates to Success Page")
	public void it_navigates_to_success_page() {
		System.out.println(pom.getInstanceCR().getPlaced().getText());
	    
	}




}
