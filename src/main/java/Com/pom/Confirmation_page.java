package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_page {
	public WebDriver driver;
	
	
	@FindBy(xpath = "//button[@title='Place Order']")
	private WebElement order;
	
	public Confirmation_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getPlaced() {
		return placed;
	}

	@FindBy(xpath = "//h1[text()='Your order has been received.']")
	private WebElement placed;

}
