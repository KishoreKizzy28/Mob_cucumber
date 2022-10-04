package Com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Rest_sdp {
	public static Response response;
	@Given("user Enter the uri")
	public void user_enter_the_uri() {
		 response = RestAssured.get("http://live.techpanda.org/index.php/catalogsearch/result/?q=SONY+XPERIA");
	}
	@When("user Get the response code")
	public void user_get_the_response_code() {
	    System.out.println(response.getStatusCode());
	}
	@When("user Get the response status Line")
	public void user_get_the_response_status_line() {
	    System.out.println(response.getStatusLine());
	}
	@When("user Get the response Aspretty")
	public void user_get_the_response_aspretty() {
	    System.out.println(response.asPrettyString());
	}
	@Then("user Validate the response Code")
	public void user_validate_the_response_code() {
		
	   
	}



}
