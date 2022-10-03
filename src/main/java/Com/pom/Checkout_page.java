package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Proceed to Checkout'])[1]")
	private WebElement checkout;
	
	public Checkout_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getHeader() {
		return header;
	}

	public WebElement getSub() {
		return sub;
	}

	@FindBy(xpath = "//h1[text()='Checkout']")
	private WebElement header;
	
	@FindBy(xpath = "(//span[text()='Continue'])[1]")
	private WebElement sub;
	

}
