package Com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base_class.Base_class;
import Com.Testrunner.Runner_class;
import Com.helper.File_Reader_Manager;
import Com.pgm.Page_Object_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart_sdp extends Base_class {
	public static WebDriver driver = Runner_class.driver;
	
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	String sheetname = "task";
	String sheetname1 = "task1";
	
	@When("user Enter the quantity in cart")
	public void user_enter_the_quantity_in_cart() throws Throwable {
		clear(pom.getInstanceSP().getQty());
		inputvalueElement(pom.getInstanceSP().getQty(),File_Reader_Manager.getInstanceFrm().getInstanceCR().getqty());
	}
	@When("user Enter the coupon code")
	public void user_enter_the_coupon_code() throws IOException {
		inputvalueElement(pom.getInstanceCP().getCouponc(),getData(sheetname1, 1, 0));
		clickonElement(pom.getInstanceCP().getApply());
		System.out.println(pom.getInstanceCP().getCoupon().getText());
	}
	@When("user Select the country")
	public void user_select_the_country() throws IOException {
		dropdown("text", pom.getInstanceCP().getCountry(),getData(sheetname1, 1, 1));
	}
	
	@When("user Select the states")
	public void user_select_the_states() throws IOException {
		inputvalueElement(pom.getInstanceCP().getRegion(), getData(sheetname1, 1, 2));
	}
	@When("user Enter the zip")
	public void user_enter_the_zip() throws IOException {
		inputvalueElement(pom.getInstanceCP().getPostcode(),getData(sheetname1, 1, 3));
	}
	@When("user Click the update")
	public void user_click_the_update() {
		clickonElement(pom.getInstanceSP().getUpdate());
	}
	@Then("user Click the proceed to Check out And it Navigates to CheckOut page")
	public void user_click_the_proceed_to_check_out_and_it_navigates_to_check_out_page() {
		clickonElement(pom.getInstanceEP().getEstimate());
		clickonElement(pom.getInstanceEP().getProceed());
	}




}
