package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Estimate_page {
	
	public WebDriver driver;
	
	public Estimate_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getEstimate() {
		return estimate;
	}

	public WebElement getProceed() {
		return proceed;
	}

	@FindBy(xpath = "//span[text()='Estimate']")
	private WebElement estimate;
	
	@FindBy(xpath = "(//span[text()='Proceed to Checkout'])[1]")
	private WebElement proceed;
	

}
