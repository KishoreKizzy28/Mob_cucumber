package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	
	public WebDriver driver;


	public Payment_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCardname() {
		return cardname;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCrd() {
		return crd;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getMoney() {
		return money;
	}

	public WebElement getCont5() {
		return cont5;
	}

	@FindBy(xpath = "//input[@title='Name on Card']")
	private WebElement cardname;
	
	@FindBy(xpath = "//select[@title='Credit Card Type']")
	private WebElement creditcard;
	
	@FindBy(xpath = "//input[@title='Credit Card Number']")
	private WebElement crd;
	
	@FindBy(xpath = "(//select[@autocomplete='off'])[2]")
	private WebElement month;
	
	@FindBy(xpath = "(//select[@autocomplete='off'])[3]")
	private WebElement date;
	
	@FindBy(xpath = "//input[@title='Card Verification Number']")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@value='checkmo']")
	private WebElement money;
	
	@FindBy(xpath = "(//span[text()='Continue'])[5]")
	private WebElement cont5;
	
	
	
	
	
}
