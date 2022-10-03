package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_page {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@title='Qty']")
	private WebElement qty;
	
	@FindBy(xpath = "(//span[text()='Update Shopping Cart'])[2]")
	private WebElement update;

	public Shopping_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getUpdate() {
		return update;
	}
	
	
	
	
}
