package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupon_page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='coupon_code']")
	private WebElement couponc;

	public Coupon_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCouponc() {
		return couponc;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getCoupon() {
		return coupon;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getRegion() {
		return region;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement apply;
	
	@FindBy (xpath = "//span[text()='Coupon code \"12345\" is not valid.']")
	private WebElement coupon;
	
	@FindBy(id = "country")
	private WebElement country;
	
	@FindBy(id = "region")
	private WebElement region;
	
	@FindBy(id = "postcode")
	private WebElement postcode;
	
}
