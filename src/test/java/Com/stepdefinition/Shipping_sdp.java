package Com.stepdefinition;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.Testrunner.Runner_class;
import Com.pgm.Page_Object_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shipping_sdp extends Base_class {
	
	public static WebDriver driver = Runner_class.driver;
	

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	String sheetname = "task";
	String sheetname1 = "task1";
	
	@When("user Click the continue2 button")
	public void user_click_the_continue2_button() {
		System.out.println(pom.getInstanceIP().getShipping().getText() + "by ship");

	}
	@Then("it Navigates to Payment Page")
	public void it_navigates_to_payment_page() {
		clickonElement(pom.getInstanceIP().getCont1());
		
	    
	    
	}




}
