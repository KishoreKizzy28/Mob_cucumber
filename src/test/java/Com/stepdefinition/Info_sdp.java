package Com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.Testrunner.Runner_class;
import Com.pgm.Page_Object_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Info_sdp extends Base_class{
	
	public static WebDriver driver = Runner_class.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	String sheetname = "task";
	String sheetname1 = "task1";
	
	
	@When("user Enter the First Name")
	public void user_enter_the_first_name() throws IOException {
		inputvalueElement(pom.getInstanceIP().getFname(),getData(sheetname, 1, 0));
	   
	}
	@When("user Enter the Last Name")
	public void user_enter_the_last_name() throws IOException {
		inputvalueElement(pom.getInstanceIP().getLname(), getData(sheetname, 1, 1));
	}
	@When("user Enter the Email Address")
	public void user_enter_the_email_address() throws IOException {
		inputvalueElement(pom.getInstanceIP().getEmail(),getData(sheetname, 1, 2));
	}
	@When("user Enter the Address")
	public void user_enter_the_address() throws IOException {
		inputvalueElement(pom.getInstanceIP().getAddress(), getData(sheetname, 1, 4));
	}
	@When("user Enter the City")
	public void user_enter_the_city() throws IOException {
		inputvalueElement(pom.getInstanceIP().getCity(), getData(sheetname, 1, 5));	
	}
	@When("user Select the State")
	public void user_select_the_state() throws IOException {
		dropdown("text",pom.getInstanceIP().getRegion1() ,getData(sheetname1, 1, 4));
	}
	@When("user Enter the Zip")
	public void user_enter_the_zip() throws IOException {
		inputvalueElement(pom.getInstanceIP().getZip(), getData(sheetname, 1, 6));		
		System.out.println(pom.getInstanceIP().getZip().getAttribute("value"));		
	}
	@When("user Select the country1")
	public void user_select_the_country1() throws IOException {
		dropdown("text", pom.getInstanceIP().getCountry1(),getData(sheetname1, 1, 5));
	}
	@When("user Enter the Mobile number")
	public void user_enter_the_mobile_number() throws IOException {
		inputvalueElement(pom.getInstanceIP().getMob(), getData(sheetname, 1, 3));
	    
	}
	@Then("user Click on continue1 button And it Navigates to Shipping page")
	public void user_click_on_continue1_button_and_it_navigates_to_shipping_page() {
		clickonElement(pom.getInstanceIP().getSub1());
	    
	}




}
