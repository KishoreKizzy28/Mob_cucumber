package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobile_page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement mobile;

	public Mobile_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCart() {
		return mobile;
	}

}
