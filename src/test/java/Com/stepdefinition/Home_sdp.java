package Com.stepdefinition;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.Testrunner.Runner_class;
import Com.helper.File_Reader_Manager;
import Com.pgm.Page_Object_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home_sdp extends Base_class{
	
	public static WebDriver driver = Runner_class.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("user Launch the Application")
	public void user_launch_the_application() throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFrm().getInstanceCR().geturl();
		geturl(url);
	    
	}
	@When("user Click on the Mobile button")
	public void user_click_on_the_mobile_button() {
		
		clickonElement(pom.GetInstanceHp().getMobile());
		
		
	    
	}
	@Then("it Navigate to Mobile Page")
	public void it_navigate_to_mobile_page() {
		
	    
	}

}
