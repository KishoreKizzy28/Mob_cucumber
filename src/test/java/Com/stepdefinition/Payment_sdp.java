package Com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.Testrunner.Runner_class;
import Com.pgm.Page_Object_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payment_sdp extends Base_class {
	
	public static WebDriver driver = Runner_class.driver;
	

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	String sheetname = "task";
	String sheetname1 = "task1";
	
	
	
	@When("user Select the Credit card saved button")
	public void user_select_the_credit_card_saved_button() {
		clickonElement(pom.getInstanceIP().getRadio());
	    
	}
	@When("user Enter the Name on Card")
	public void user_enter_the_name_on_card() throws IOException {
		inputvalueElement(pom.getInstancePP().getCardname(),getData(sheetname, 1, 7));
	}
	@When("user Select the Card Type")
	public void user_select_the_card_type() throws IOException {
		dropdown("text", pom.getInstancePP().getCreditcard(),getData(sheetname1, 1, 6));
	   
	}
	@When("user Enter the Credit Card Number")
	public void user_enter_the_credit_card_number() throws IOException {
		inputvalueElement(pom.getInstancePP().getCrd(), getData(sheetname, 1, 8));
	    
	}
	@When("user Select the Month And user Select the date")
	public void user_select_the_month_and_user_select_the_date() throws IOException {
		
		dropdown("value",pom.getInstancePP().getMonth() , getData(sheetname1, 1, 7));
		dropdown("value",pom.getInstancePP().getDate(),getData(sheetname1, 1, 8));
	    
	}
	@When("user Enter cvv numver")
	public void user_enter_cvv_numver() throws IOException {
		inputvalueElement(pom.getInstancePP().getCvv(), getData(sheetname, 1, 9));
	    
	}
	@When("user Click the Check button")
	public void user_click_the_check_button() {
		clickonElement(pom.getInstancePP().getMoney());
	    
	}
	@Then("user Click the continue3 button And it Navigate to Order Review Page")
	public void user_click_the_continue3_button_and_it_navigate_to_order_review_page() {
		clickonElement(pom.getInstancePP().getCont5());
	}




}
